package com.example.prueba0;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	// ES EL LISTENER QUE ESCUCHA TU OPCION EN EL MENU
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch( item.getItemId()){
		
			case R.id.cbasicos: 
				Intent a1 = new Intent(MainActivity.this, MainMenuBasic.class);
				startActivity(a1);
				return true;
			case R.id.cavanzados: 
				
		}
		return super.onOptionsItemSelected(item);
	}
}
