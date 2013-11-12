package com.example.prueba0;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainRadioButton extends Activity {

	private CheckBox chkIos, chkAndroid, chkWindows;
	private Button btnDisplay;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maincheckbox);

		addListenerOnChkIos();
		addListenerOnButton();
	}

	public void addListenerOnChkIos() {

		chkIos = (CheckBox) findViewById(R.id.chkIos);

		chkIos.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (((CheckBox) v).isChecked()) {
					Toast.makeText(MainRadioButton.this,
							"Bro, try Android :)", Toast.LENGTH_LONG).show();
				}

			}
		});

	}

	public void addListenerOnButton() {

		chkIos = (CheckBox) findViewById(R.id.chkIos);
		chkAndroid = (CheckBox) findViewById(R.id.chkAndroid);
		chkWindows = (CheckBox) findViewById(R.id.chkWindows);
		btnDisplay = (Button) findViewById(R.id.btnDisplay);

		btnDisplay.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				StringBuffer result = new StringBuffer();
				result.append("IPhone check : ")
						.append(chkIos.isChecked());
				result.append("\nAndroid check : ").append(
						chkAndroid.isChecked());
				result.append("\nWindows Mobile check :").append(
						chkWindows.isChecked());

				Toast.makeText(MainRadioButton.this, result.toString(),
						Toast.LENGTH_LONG).show();

			}
		});

	}
}