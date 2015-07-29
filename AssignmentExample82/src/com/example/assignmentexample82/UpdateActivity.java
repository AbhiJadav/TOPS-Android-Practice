package com.example.assignmentexample82;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class UpdateActivity extends ActionBarActivity {

	Button update;
	EditText edname,edemail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update);
		update=(Button)findViewById(R.id.btnupdate);
		edname=(EditText)findViewById(R.id.edunaem);
		edemail=(EditText)findViewById(R.id.eduemail);
		Intent t=getIntent();
		final int i=t.getIntExtra("id", 0);
		edname.setText(t.getStringExtra("name"));
		edemail.setText(t.getStringExtra("email"));
		update.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user=new User();
				user.setId(i);
				user.setName(edname.getText().toString());
				user.setEmail(edemail.getText().toString());
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
