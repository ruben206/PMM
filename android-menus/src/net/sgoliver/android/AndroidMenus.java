package net.sgoliver.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.TextView;

public class AndroidMenus extends Activity {

	private static final int MNU_OPC1 = 1;
	private static final int MNU_OPC2 = 2;
	private static final int MNU_OPC3 = 3;
	
	private static final int SMNU_OPC1 = 31;
	private static final int SMNU_OPC2 = 32;
	
	private TextView lblMensaje;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        lblMensaje = (TextView)findViewById(R.id.LblMensaje);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	
    	//Alternativa 1
    	
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        
    	//Alternativa 2
        
        //menu.add(Menu.NONE, MNU_OPC1, Menu.NONE, "Opcion1").setIcon(R.drawable.tag);
        //menu.add(Menu.NONE, MNU_OPC1, Menu.NONE, "Opcion2").setIcon(R.drawable.filter);
        
        //SubMenu smnu = menu.addSubMenu(Menu.NONE, MNU_OPC1, Menu.NONE, "Opcion3")
        //                        .setIcon(R.drawable.chart);
        //smnu.add(Menu.NONE, SMNU_OPC1, Menu.NONE, "Opcion 3.1");
        //smnu.add(Menu.NONE, SMNU_OPC2, Menu.NONE, "Opcion 3.2");
        
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case R.id.MnuOpc1:
            lblMensaje.setText("Opcion 1 pulsada!");
            return true;
        case R.id.MnuOpc2:
        	lblMensaje.setText("Opcion 2 pulsada!");;
            return true;
        case R.id.MnuOpc3:
        	lblMensaje.setText("Opcion 3 pulsada!");;
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
}