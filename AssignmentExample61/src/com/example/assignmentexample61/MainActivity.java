package com.example.assignmentexample61;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText ed,ed1;
	Button b,b1;
	TextView tx;
	List<SerializeDemo>list;
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed=(EditText)findViewById(R.id.editText1);
		ed1=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		b1=(Button)findViewById(R.id.button2);
		tx=(TextView)findViewById(R.id.txtshow);
		lv=(ListView)findViewById(R.id.listView1);
		
		
		list=new ArrayList<SerializeDemo>();
		b.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					
					SerializeDemo demo=new SerializeDemo();
					File sdcard=Environment.getExternalStorageDirectory();
					File dir=new File(sdcard.getAbsolutePath()+"/SerializeDemo");
					dir.mkdir();
					File file=new File(dir.getAbsolutePath()+"/serializedemofile.txt");
					FileOutputStream fos=new FileOutputStream(file);
					ObjectOutputStream obout=new ObjectOutputStream(fos);
					demo.setName(ed.getText().toString());
					demo.setPass(ed1.getText().toString());
					obout.writeObject(demo);
					list.add(demo);
					obout.close();
					Toast.makeText(MainActivity.this, "Serialize file Created", Toast.LENGTH_LONG).show();
					
					
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				
			}
		});
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*Intent t=new Intent(MainActivity.this,ShowFileActivity.class);
				startActivity(t);*/
try {
					
					SerializeDemo demo=new SerializeDemo();
					File sdcard=Environment.getExternalStorageDirectory();
					//File dir=new File(sdcard.getAbsolutePath()+"/SerializeDemo");
					//dir.mkdir();
					File file=new File(sdcard.getAbsolutePath()+"/SerializeDemo/serializedemofile.txt");
					FileInputStream fis=new FileInputStream(file);
					ObjectInputStream obout=new ObjectInputStream(fis);
					demo=(SerializeDemo)obout.readObject();
					lv.setAdapter(new ArrayAdapter<SerializeDemo>(MainActivity.this, android.R.layout.simple_list_item_1, list));
					String data=demo.getName().toString()+demo.getPass().toString();
					tx.setText(data);
					
					obout.close();
					Toast.makeText(MainActivity.this, "Serialize file Created", Toast.LENGTH_LONG).show();
					
					
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
