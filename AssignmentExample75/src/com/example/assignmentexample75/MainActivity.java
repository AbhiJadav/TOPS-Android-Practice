package com.example.assignmentexample75;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.ToggleButton;

public class MainActivity extends ActionBarActivity {

	ListView lv;
	GridView gr;
	ToggleButton b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv=(ListView)findViewById(R.id.listView1);
		gr=(GridView)findViewById(R.id.gridView1);
		b=(ToggleButton)findViewById(R.id.toggleButton1);
		b.setTextOn("Grid view");
		b.setTextOff("List View");
		b.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
if(isChecked)
{
	lv.setAdapter(new ListAdapater(MainActivity.this));
	gr.setVisibility(View.INVISIBLE);
	lv.setVisibility(View.VISIBLE);
	b.setText("Grid view");

}
if(!isChecked) {
	gr.setAdapter(new GrideAdapter(MainActivity.this));
	lv.setVisibility(View.INVISIBLE);
	gr.setVisibility(View.VISIBLE);
	
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
