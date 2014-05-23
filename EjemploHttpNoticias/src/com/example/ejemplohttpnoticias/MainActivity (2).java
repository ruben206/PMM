package com.example.ejemplohttpnoticias;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Button boton;
	private TextView texto;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = (Button)findViewById(R.id.Boton1);
        texto = (TextView)findViewById(R.id.texto1);
        
        //Escuchador del bot�n. Acciones en caso de pulsar el bot�n
        boton.setOnClickListener(new OnClickListener() {
        	public void onClick(View view) {
        		try {
        			String noticias = buscarNoticias();
        			texto.append(noticias);
        		} catch (Exception e) {
        			texto.append("Error al conectar");
        			e.printStackTrace();
        		}
        	}
        });
    }

    private String buscarNoticias() throws Exception {
    	String salida="";
    	int i=0, j=0;
	
    	//Direcci�n de la p�gina (RSS) que queremos obtener (Corresponde a titulares del peri�dico)
    	URL url = new URL("http://www.elpais.com/rss/feed.html?feedId=1022");
    	//Conexi�n de tipo HTTP
    	HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
    	//A�adimos una cabecera HTTP para que identificarnos y evitar obtener un error de aquellos
    	//servidores que prohiben la respuesta a aquellos clientes que no se identifican.
    	conexion.setRequestProperty("User-Agent", "Mozilla/5.0" + " (Linux; Android 1.5; es-ES) Ejemplo HTTP");
	    	
    	if (conexion.getResponseCode() == HttpURLConnection.HTTP_OK) {
    		BufferedReader lector = new BufferedReader (
    				new InputStreamReader(conexion.getInputStream()));
    		String linea = lector.readLine();
    		while (linea != null) {
    			//Si encontramos la etiqueta <title> podemos recuperar la noticia
    			if (linea.indexOf("<title>") >= 0) {
    				i = linea.indexOf("<title>")+16;
    				j = linea.indexOf("</title>")-3;
    				salida += linea.substring(i,j);
    				salida += "\n----------------\n";
    			}
    			//Leemos la siguiente l�nea
    			linea = lector.readLine();
    		}
    		lector.close();
    	} else {
    		salida = "No encontrado";
    	}
    	conexion.disconnect();
	
    	return salida;
    }
}
