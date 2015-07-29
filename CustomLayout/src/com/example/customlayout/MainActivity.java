package com.example.customlayout;

import android.R.string;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	LinearLayout l;
	EditText name,password;
	Button b;
	RadioButton rd1,rd2;
	RadioGroup rg;
	CheckBox ch1,ch2;
	TextView tname,tpass,thobby,tcheck,tresult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		l=new LinearLayout(this);
		l.setOrientation(LinearLayout.VERTICAL);
		tname=new TextView(this);
		tpass=new TextView(this);
		thobby=new TextView(this);
		tcheck=new TextView(this);
		tresult=new TextView(this);
		tname.setText("Enter Name");
		tpass.setText("Enter password");
		thobby.setText("Select Hobby");
		tcheck.setText("Select Gender");
		name=new EditText(this);
		password=new EditText(this);
		b=new Button(this);
		b.setText("Click Here");
		rd1=new RadioButton(this);
		rd1.setText("Male");
		rd2=new RadioButton(this);
		rd2.setText("Female");
		rg=new RadioGroup(this);
		rg.addView(rd1);
		rg.addView(rd2);
		ch1=new CheckBox(this);
		ch2=new CheckBox(this);
		ch1.setText("Cricket");
		ch2.setText("FootBall");
		int width=LinearLayout.LayoutParams.MATCH_PARENT;
		int height=LinearLayout.LayoutParams.WRAP_CONTENT;
		l.addView(tname, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(name, new LinearLayout.LayoutParams(width, height));
		l.addView(tpass, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(password, new LinearLayout.LayoutParams(width, height));
		l.addView(tcheck, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(rg, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(thobby, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(ch1, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(ch2, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		l.addView(b, new LinearLayout.LayoutParams(width, height));
		l.addView(tresult, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String gen = null,hob = null;
				StringBuffer sb=new StringBuffer();
				if(rd1.isChecked())
				gen=rd2.getText().toString();
				if(rd2.isChecked())
					gen=rd2.getText().toString();
				if(ch1.isChecked())
					hob=ch1.getText().toString();
				sb.append(hob);
				if(ch2.isChecked())
					hob=hob+ch2.getText().toString();
				sb.append(hob);
				String s=name.getText()+" "+password.getText()+" "+gen+" "+hob;
				tresult.setText(s);
			}
		});
		
		
		setContentView(l);
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
