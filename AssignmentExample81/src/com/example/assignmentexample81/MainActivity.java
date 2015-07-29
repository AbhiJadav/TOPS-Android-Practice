package com.example.assignmentexample81;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Button add,read;
	EditText ed;
	TextView tx;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		add=(Button)findViewById(R.id.button1);
		read=(Button)findViewById(R.id.button2);
		ed=(EditText)findViewById(R.id.editText1);
		tx=(TextView)findViewById(R.id.textView1);
		add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					String str=ed.getText().toString();
					File sdcard=Environment.getExternalStorageDirectory();
					File dir=new File(sdcard.getAbsolutePath()+"/MyDir");
					dir.mkdir();
					File file=new File(dir.getAbsolutePath()+"/mydoc.txt");
					if(!file.exists())
					{
						file.createNewFile();
						FileOutputStream fos=new FileOutputStream(file);
						fos.write(str.getBytes());
						
						
					}
					else
					{
						FileOutputStream fos=new FileOutputStream(file, true);
						fos.write(str.getBytes());
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
			}
		});
		read.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					File sdcard=Environment.getExternalStorageDirectory();
					File file=new File(sdcard.getAbsolutePath()+"/MyDir/mydoc.txt");
					FileInputStream fis=new FileInputStream(file);
					int i;
					StringBuffer sb=new StringBuffer();
					while((i=fis.read())!=-1)
					{
						sb.append((char)i);
					}
					
					tx.setText("Data: " + sb.toString());
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
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
