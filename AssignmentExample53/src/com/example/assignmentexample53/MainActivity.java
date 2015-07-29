package com.example.assignmentexample53;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button r,l,g,t,f;
	
	Intent t1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		setContentView(R.layout.activity_main);
		r=(Button)findViewById(R.id.button1);
		l=(Button)findViewById(R.id.button2);
		g=(Button)findViewById(R.id.button3);
		t=(Button)findViewById(R.id.button4);
		f=(Button)findViewById(R.id.button5);
		
		r.setOnClickListener(MainActivity.this);
		l.setOnClickListener(MainActivity.this);
		g.setOnClickListener(MainActivity.this);
		t.setOnClickListener(MainActivity.this);
		f.setOnClickListener(MainActivity.this);
		
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(v==r)
				{
					t1=new Intent(MainActivity.this,Relative_Layout.class);
					startActivity(t1);
					
				}
				if(v==l)
				{
					t1=new Intent(getApplicationContext(),Linear_Layout.class);
					startActivity(t1);
				}
				if(v==f)
				{
					t1=new Intent(MainActivity.this,FrameLayout.class);
					startActivity(t1);
				}
				if(v==t)
				{
					t1=new Intent(MainActivity.this,TableLayout.class);
					startActivity(t1);
				}
				if(v==g)
				{
					t1=new Intent(MainActivity.this,GridLayout.class);
					startActivity(t1);
				}
		
		
	}
}
