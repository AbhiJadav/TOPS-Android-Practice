package com.example.assignmentexample56;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends ActionBarActivity {

	ArrayList<String>list=new ArrayList<String>();
	ListView l;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		l=(ListView)findViewById(R.id.listView1);
		Intent i=getIntent();
		System.out.println("hello");
		list.add(i.getStringExtra("fname"));
		list.add(i.getStringExtra("fadd"));
		list.add(i.getStringExtra("fNo"));
		list.add(i.getStringExtra("fGen"));
		list.add(i.getStringExtra("fCheck"));
		l.setAdapter(new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1, list));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list, menu);
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
