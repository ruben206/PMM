package com.example.prueba0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuBasic extends Activity  {
	Button check, radio, listas;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenubasicos);


		final Button check = (Button) findViewById(R.id.checkb);
		final Button radio = (Button) findViewById(R.id.radiob);
		final Button listas = (Button) findViewById(R.id.listas);
		
	
		check.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent a1 = new Intent(MainMenuBasic.this, MainCheckButton.class);
				startActivity(a1);
			}
		});
		radio.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent a2 = new Intent(MainMenuBasic.this, MainRadioButton.class);
				startActivity(a2);
			}
		});
	}
	
	
	
	
	
	

}
