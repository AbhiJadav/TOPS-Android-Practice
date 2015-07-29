package com.example.listviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText ed;
	Button b;
	ListView lv;
	List<HashMap<String, String>>list=new ArrayList<HashMap<String,String>>();
	String listString[]={"Nirbhay","Android","Java","PHP","Iphone"};
	HashMap<String,String>hm=new HashMap<String, String>();
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ed=(EditText)findViewById(R.id.editText1);
		b=(Button)findViewById(R.id.button1);
		lv=(ListView)findViewById(R.id.listView1);
		hm.put("item1","PHP");
		hm.put("item2", "JAVA");
		hm.put("item3", "Android");
		
		
		HashMap<String, String> hm1=new HashMap<String, String>();
		hm1.put("item1","PHP");
		hm1.put("item2", "JAVA");
		hm1.put("item3", "Android");
		String s=hm.get("item1");
		//Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
		list.add(hm);
		list.add(hm1);
		String[] from={"item1","item2","item3"};
		int[] to={R.id.textView1,R.id.textView2,R.id.textView3};
		//lv.setAdapter(new ArrayAdapter<HashMap<String, String>>(MainActivity.this, android.R.layout.simple_list_item_1, list));
		lv.setAdapter(new SimpleAdapter(MainActivity.this, list, R.layout.custom, from, to));
		
		/*b.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			list.add(ed.getText().toString());
			lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,list));
			
		
		}
	});
	for(int i=0;i<listString.length;i++)
	{
		lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,listString));
		
	}
		lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.simplearray)));
	*/
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
