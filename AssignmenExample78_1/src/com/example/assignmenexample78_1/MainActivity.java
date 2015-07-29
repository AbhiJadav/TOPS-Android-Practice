package com.example.assignmenexample78_1;

import java.io.IOException;
import java.io.InputStream;

import android.support.v7.app.ActionBarActivity;
import android.text.Html;
import android.text.Spanned;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
TextView t,t1,t2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// p=Html.fromHtml("<p>This is Paragph tag</p");
		t=(TextView)findViewById(R.id.textView1);
		t1=(TextView)findViewById(R.id.textView2);
		t2=(TextView)findViewById(R.id.textView3);
		//t.setText(p);
		prg();
		imag();
		table();
		
		
		
	}
	void imag()
	{
		try {
			InputStream is=getAssets().open("imagetag.txt");
			int size=is.available();
			byte[] buffre=new byte[size];
			is.read(buffre);
			is.close();
			t1.setText(new String(buffre));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	void prg()
	{
		try {
			InputStream is=	getAssets().open("pargraph.txt");
			int size=is.available();
			byte[] buffre=new byte[size];
			is.read(buffre);
			is.close();
			t.setText(new String(buffre));
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void table()
	{
		try {
			InputStream is=getAssets().open("tabletag.txt");
			int size=is.available();
			byte[] buffer=new byte[size];
			is.read(buffer);
			is.close();
			t2.setText(new String(buffer));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
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
