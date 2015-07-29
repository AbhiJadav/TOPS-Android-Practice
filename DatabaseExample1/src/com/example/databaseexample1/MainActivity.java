package com.example.databaseexample1;

import java.util.List;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText name,pass;
	Button b;
	ListView lv;
	List<User>list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name=(EditText)findViewById(R.id.editText1);
		pass=(EditText)findViewById(R.id.editText2);
		b=(Button)findViewById(R.id.button1);
		lv=(ListView)findViewById(R.id.listView1);
		
		//DbHandler db=new DbHandler(MainActivity.this);
		
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				User user=new User();
				DbHandler db=new DbHandler(MainActivity.this);
				user.setName(name.getText().toString());
				user.setPass(pass.getText().toString());
				db.insert(user);
				Toast.makeText(MainActivity.this, "Insert", Toast.LENGTH_LONG).show();
				list=db.show();
				lv.setAdapter(new MyAdapter(list, MainActivity.this));
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
