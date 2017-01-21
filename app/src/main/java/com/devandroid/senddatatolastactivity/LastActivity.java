package com.devandroid.senddatatolastactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Anatoliy on 15.01.2017.
 */

public class LastActivity extends Activity {

	private TextView textLogin;
	private TextView textPassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_last);

		textLogin = (TextView) findViewById(R.id.textLogin);
		textPassword = (TextView) findViewById(R.id.textPassword);

		textLogin.setText(getIntent().getStringExtra("login"));
		textPassword.setText(getIntent().getStringExtra("pass"));
	}

	public void back(View view){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
}
