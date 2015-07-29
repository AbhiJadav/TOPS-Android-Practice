package com.example.assignmentexample56;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

	EditText name,add,phone;
	RadioGroup rg;
	CheckBox ch1,ch2;
	Button bu;
	String gen="",check="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		name=(EditText)findViewById(R.id.editText1);
		add=(EditText)findViewById(R.id.editText2);
		phone=(EditText)findViewById(R.id.editText3);
		rg=(RadioGroup)findViewById(R.id.radioGroup1);
		ch1=(CheckBox)findViewById(R.id.checkBox1);
		ch2=(CheckBox)findViewById(R.id.checkBox2);
		bu=(Button)findViewById(R.id.btn);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(checkedId==R.id.radio0)
				{
					gen="Male";
				}
				if(checkedId==R.id.radio1)
				{
					gen="female";
				}
			}
		});
		
		bu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(ch1.isChecked())
				{
					check="Football";
				}
				if(ch2.isChecked())
				{
					check="Cricket";
				}
				Intent t=new Intent(MainActivity.this,ListActivity.class);
				t.putExtra("fname",name.getText().toString());
				t.putExtra("fadd",add.getText().toString() );
				t.putExtra("fNo",phone.getText().toString());
				t.putExtra("fGen", gen);
				t.putExtra("fCheck",check);
				System.out.println(check);
				startActivity(t);
				
				Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_LONG).show();
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
