package net.sgoliver;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class FrmBotones extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView lblMensaje = (TextView)findViewById(R.id.LblMensaje);
        
        final Button btnBoton1 = (Button)findViewById(R.id.BtnBoton1);
        
        btnBoton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				lblMensaje.setText("Bot�n 1 pulsado!");
			}
		});
        
        final ToggleButton btnBoton2 = (ToggleButton)findViewById(R.id.BtnBoton2);
        
        btnBoton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				if(btnBoton2.isChecked())
					lblMensaje.setText("Bot�n 2: ON");
				else
					lblMensaje.setText("Bot�n 2: OFF");
			}
		});
        
        final ImageButton btnBoton3 = (ImageButton)findViewById(R.id.BtnBoton3);
        
        btnBoton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				lblMensaje.setText("Bot�n 3 pulsado!");
			}
		});
        
        final ToggleButton btnBoton4 = (ToggleButton)findViewById(R.id.BtnBoton4);
        
        btnBoton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0)
			{
				if(btnBoton4.isChecked())
					lblMensaje.setText("Bot�n 4: ON");
				else
					lblMensaje.setText("Bot�n 4: OFF");
			}
		});
    }
}