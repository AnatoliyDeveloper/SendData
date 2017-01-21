package com.devandroid.senddatatolastactivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private EditText login;
	private EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		login = (EditText) findViewById(R.id.login);
		password = (EditText) findViewById(R.id.password);
	}

	public void sendData (View view){
		Intent intent = new Intent(this, LastActivity.class);
		intent.putExtra("login", login.getText().toString());
		intent.putExtra("pass", password.getText().toString());

		startActivity(intent);
	}

	public void onShowLong(View view){
		//Toast toast = new Toast(getApplicationContext());
		//Toast.makeText(this, "Hello", ).show();
		Toast toast = Toast.makeText(getApplicationContext(), "Hello_4_seconds", Toast.LENGTH_LONG);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

	public void onShowShort(View view){
		Toast.makeText(this, "Hello_2_seconds", Toast.LENGTH_SHORT).show();
	}

	public void onPosition(View view){
		Context context = getApplicationContext();
		Configuration configuration = getResources().getConfiguration();

		if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
			Toast.makeText(context, "ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show();
		} else if(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
			Toast.makeText(context, "ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show();
		}
	}
}
