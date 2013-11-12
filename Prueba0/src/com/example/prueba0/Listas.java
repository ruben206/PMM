package com.example.prueba0;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Listas extends Activity {
	
	
	private Persona[] datos =new Persona[]{
				new Persona("Alicia", "Pons",30,R.drawable.travis),
				new Persona("David", "Garcia", 25, R.drawable.jose),
				new Persona("Pedro", "Garcia", 25, R.drawable.pe)};
	
	class AdaptadorPersona extends ArrayAdapter<Persona> {
		
		Activity context;
		AdaptadorPersona(Activity context) {
		super(context, R.layout.listin, datos);
		this.context = context;
		}
		
		public View getView(int position,View convertView,ViewGroup parent) {
		//if(item==null)	
		LayoutInflater inflater = context.getLayoutInflater();
			
		View item = inflater.inflate(R.layout.listin, null);
		 	 	 
		final TextView lblApellido=(TextView)item.findViewById(R.id.apellido);
		final TextView lblNombre = (TextView)item.findViewById(R.id.nombre);
		final TextView lblEdad = (TextView)item.findViewById(R.id.edad);
		ImageView lafoto=(ImageView)item.findViewById(R.id.foto);
		
		lblNombre.setText(datos[position].getNombre());
		lblApellido.setText(datos[position].getApellido());
		lblEdad.setText(Integer.toString(datos[position].getEdad()));
		lafoto.setImageResource(datos[position].getFoto());
		return(item);
		}
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        AdaptadorPersona adaptador =new AdaptadorPersona(this);
		final ListView lstOpciones = (ListView)findViewById(R.id.LstOpciones);
		lstOpciones.setAdapter(adaptador);
		
		lstOpciones.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				
				Intent intent =new Intent(Listas.this, Proceso.class);
				
				String nom=((Persona)a.getAdapter().getItem(position)).getNombre();
				String ape =((Persona)a.getAdapter().getItem(position)).getApellido();
				int edad= ((Persona)a.getAdapter().getItem(position)).getEdad();
				int lafoto= ((Persona)a.getAdapter().getItem(position)).getFoto();
				Bundle b = new Bundle();
				b.putString("persona",nom);
				b.putString("apellido", ape);
				b.putInt("edad", edad);
				b.putInt("foto", lafoto);

				
				intent.putExtras(b);
				
                startActivity(intent);
			}
    });


    }    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
 
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
