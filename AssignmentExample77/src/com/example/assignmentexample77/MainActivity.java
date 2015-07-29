package com.example.assignmentexample77;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore.Files;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b=(Button)findViewById(R.id.button1);
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					InputStream is=getAssets().open("pargraph.txt");
					int i=is.available();
					byte[] buffer=new byte[i];
					is.read(buffer);
					is.close();
					String s=new String(buffer);
					File sdcard=Environment.getExternalStorageDirectory();
					File dir=new File(sdcard.getAbsolutePath()+"/My Dir");
					dir.mkdir();
					File file=new File(dir.getAbsolutePath()+"/copy.txt");
					if(!file.exists())
					{
						file.createNewFile();
						FileOutputStream fos=new FileOutputStream(file);
						fos.write(s.getBytes());
						Toast.makeText(MainActivity.this, "File Copy", Toast.LENGTH_LONG).show();
						
						
					}
					else {
						FileOutputStream fos=new FileOutputStream(file,true);
						fos.write(s.getBytes());
						Toast.makeText(MainActivity.this, "File Copy", Toast.LENGTH_LONG).show();
						
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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
