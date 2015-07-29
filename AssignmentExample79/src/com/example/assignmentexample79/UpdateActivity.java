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

public class UpdateActivity extends ActionBarActivity {

	Button b;
	EditText edname,edemail,edphone,edadd;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);
		b=(Button)findViewById(R.id.btnupdate);
		edname=(EditText)findViewById(R.id.upname);
		edemail=(EditText)findViewById(R.id.upemail);
		edphone=(EditText)findViewById(R.id.upphone);
		edadd=(EditText)findViewById(R.id.upadd);
		
		Intent i=getIntent();
		final int id=i.getIntExtra("id", 0);
		edname.setText(i.getStringExtra("name"));
		edemail.setText(i.getStringExtra("email"));
		edphone.setText(i.getStringExtra("phone"));
		edadd.setText(i.getStringExtra("add"));
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user=new User();
				user.setId(id);
				user.setName(edname.getText().toString());
				user.setEmail(edemail.getText().toString());
				user.setPhone(edphone.getText().toString());
				user.setAdd(edadd.getText().toString());
				DbHandler db=new DbHandler(UpdateActivity.this);
				db.update(user);
				Intent t=new Intent(UpdateActivity.this,ShowActivity.class);
				startActivity(t);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update, menu);
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
