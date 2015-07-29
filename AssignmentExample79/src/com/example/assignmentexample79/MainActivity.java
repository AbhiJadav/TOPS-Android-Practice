package com.example.assignmentexample79;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	Button add,display;
	EditText edname,edemail,edphone,edadd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		add=(Button)findViewById(R.id.button1);
		display=(Button)findViewById(R.id.button2);
		edname=(EditText)findViewById(R.id.editText1);
		edemail=(EditText)findViewById(R.id.editText2);
		edphone=(EditText)findViewById(R.id.editText3);
		edadd=(EditText)findViewById(R.id.editText4);
		
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user=new User();
				DbHandler dbHandler=new DbHandler(MainActivity.this);
				user.setName(edname.getText().toString());
				user.setEmail(edemail.getText().toString());
				user.setPhone(edphone.getText().toString());
				user.setAdd(edadd.getText().toString());
			dbHandler.insertdata(user);
			Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
			}
		});
		display.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent t=new Intent(MainActivity.this,ShowActivity.class);
				startActivity(t);
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
