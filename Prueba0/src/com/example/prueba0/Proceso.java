package com.example.prueba0;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Proceso extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pe);
		
		final TextView txtmensaje=(TextView)findViewById(R.id.text);
		final ImageView imagen=(ImageView)findViewById(R.id.image);
		Bundle bundle=getIntent().getExtras();
		txtmensaje.setText("Bienvenido "+bundle.getString("persona"));
		txtmensaje.setText("Bienvenido "+bundle.getString("apellido"));
		txtmensaje.setText("Bienvenido "+bundle.getInt("edad"));
		imagen.setImageResource(bundle.getInt("foto"));
	}
}