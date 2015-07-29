package com.example.assignmentexample80;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText elemail,lpass;
	Button btnlog,btnnew;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnlog=(Button)findViewById(R.id.button1);
		btnnew=(Button)findViewById(R.id.button2);
		elemail=(EditText)findViewById(R.id.edlemail);
		lpass=(EditText)findViewById(R.id.edlpass);
		final SharedPreferences sp=getSharedPreferences("LoginData",MODE_PRIVATE);
		
		btnlog.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String semail,spass,uname;
				semail=sp.getString("useremail", null);
				spass=sp.getString("userpass", null);
				uname=sp.getString("username", null);
				if(semail.equals(elemail.getText().toString()) && spass.equals(lpass.getText().toString()))
				{
					Intent i=new Intent(MainActivity.this,Wel_Come.class);
					i.putExtra("loguser",uname);
					startActivity(i);
				}
				else
				{
					Toast.makeText(MainActivity.this, "invlid user", Toast.LENGTH_SHORT).show();
				}
				
			}
		});
		btnnew.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,RegisterActivity.class);
				startActivity(i);
			}
		});
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
