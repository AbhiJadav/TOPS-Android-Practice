package com.example.assignmentexample80;

import android.support.v7.app.ActionBarActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends ActionBarActivity {

	Button b;
	EditText name,phone,email,pass,rpass;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		b=(Button)findViewById(R.id.btnsubmit);
		name=(EditText)findViewById(R.id.edname);
		phone=(EditText)findViewById(R.id.edphone);
		email=(EditText)findViewById(R.id.edemail);
		pass=(EditText)findViewById(R.id.edpass);
		rpass=(EditText)findViewById(R.id.edrpass);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// ODO Auto-generated method stub
				String spass,srpass;
				spass=pass.getText().toString();
				srpass=rpass.getText().toString();
				if(srpass.equals(spass))

				{
				SharedPreferences sp=getSharedPreferences("LoginData",MODE_PRIVATE);
				SharedPreferences.Editor spe=sp.edit();
				spe.putString("username", name.getText().toString());
				spe.putString("userphone",phone.getText().toString());
				spe.putString("useremail", email.getText().toString());
				spe.putString("userpass", pass.getText().toString());
				spe.commit();
				Toast.makeText(RegisterActivity.this, "Sucessfully Register", Toast.LENGTH_SHORT).show();
				}
				else
				{
					rpass.setError("Password not Match");
				}
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
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
