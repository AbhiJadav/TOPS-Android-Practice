package com.example.edittexboxwithvalidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Pattern;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText name,password,rpassword,email,phone;
	Button submit;
	String fname,upass,urpass,conpass,uemail,uphone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name=(EditText)findViewById(R.id.editText1);
		password=(EditText)findViewById(R.id.editText2);
		rpassword=(EditText)findViewById(R.id.editText3);
		email=(EditText)findViewById(R.id.editText4);
		phone=(EditText)findViewById(R.id.editText5);
		submit=(Button)findViewById(R.id.button1);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(name.length()==0)
				{
					name.setError("Enter Name");
					//fname=name.getText().toString().toUpperCase();
				}
				else if(Pattern.matches("[A-Za-z]/ [A-Za-z]",name.getText().toString()))
				{
					fname=name.getText().toString();
				}
				else if(password.length()==0 )
				{
					password.setError("Password");
					
				}
				else if(password.length()<6)
				{
					password.setError("Min 6 Char");
					
				}
							
				else if(!Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,32})",password.getText().toString()))
				{
					password.setError("Number-Special Require");
				}
				
				else if(!password.getText().toString().equals(rpassword.getText().toString()))
				{
					rpassword.setError("Password Not Match");
				}
				else if(email.length()==0 )
				{
					email.setError("Email Require");
				}
				else if(!Pattern.matches("[a-zA-Z0-9._]+[@]{1}[a-z]+[.]{1}[a-z]+",email.getText().toString()))
				{
					email.setError("Not valid Email");
				}
				else if(phone.length()==0)
				{
					phone.setError("Phone Number");
				}
				else if(!Pattern.matches("[789][0-9]{9}",phone.getText().toString()))
				{
					phone.setError("Invalid Number");
				}
				else
				{
				//Toast.makeText(MainActivity.this, name.getText().toString(), Toast.LENGTH_LONG).show();
					fname="Name: "+name.getText().toString().toUpperCase();
					urpass="Password: "+rpassword.getText().toString();
					uemail="Email Address: "+email.getText().toString().toLowerCase();
					uphone="Mobile No."+phone.getText().toString();
					//String newline="---------------------------------";
					try {
						File sd=Environment.getExternalStorageDirectory();
						File dir=new File(sd.getAbsolutePath()+"/User Info");
						dir.mkdir();
						File file=new File(dir.getAbsolutePath()+"/Details.txt");
						if(!file.exists())
						{
							file.createNewFile();
							FileOutputStream fos=new FileOutputStream(file,true);
							fos.write(fname.getBytes());
							fos.write("\n".getBytes());
							fos.write(urpass.getBytes());
							fos.write("\n".getBytes());
							fos.write(uemail.getBytes());
							fos.write("\n".getBytes());
							fos.write(uphone.getBytes());
							fos.write("\n".getBytes());
							fos.write("---------------------------------".getBytes());
							fos.write("\n".getBytes());
							cleardata();
							Toast.makeText(MainActivity.this, "File Created", Toast.LENGTH_SHORT).show();
							
						}
						else
						{
							FileOutputStream fos=new FileOutputStream(file,true);
							fos.write(fname.getBytes());
							fos.write("\n".getBytes());
							fos.write(urpass.getBytes());
							fos.write("\n".getBytes());
							fos.write(uemail.getBytes());
							fos.write("\n".getBytes());
							fos.write(uphone.getBytes());
							fos.write("\n".getBytes());
							fos.write("---------------------------------".getBytes());
							fos.write("\n".getBytes());
							cleardata();
							Toast.makeText(MainActivity.this, "Data Updated", Toast.LENGTH_SHORT).show();
						}
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
		}
		});
		
	}
	
	void cleardata()
	{
		name.setText("");
		password.setText("");
		rpassword.setText("");
		email.setText("");
		phone.setText("");
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
