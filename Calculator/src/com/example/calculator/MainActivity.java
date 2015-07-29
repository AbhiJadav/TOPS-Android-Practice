package com.example.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	Button b1,b2,b3,b4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		b1=(Button)findViewById(R.id.button1);
		b2=(Button)findViewById(R.id.button2);
		b3=(Button)findViewById(R.id.button3);
		b4=(Button)findViewById(R.id.button4);
		
		b1.setOnClickListener(MainActivity.this);
		b2.setOnClickListener(MainActivity.this);
		b3.setOnClickListener(MainActivity.this);
		b4.setOnClickListener(MainActivity.this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		if(arg0==b1){
			Intent i = new Intent(MainActivity.this,Activity_1_1.class);
			startActivity(i);
		}
		
		else if(arg0==b2){
			Intent i = new Intent(MainActivity.this,Activity_1_2.class);
			startActivity(i);
		}
		

		else if(arg0==b3){
			Intent i = new Intent(MainActivity.this,Activity_1_3.class);
			startActivity(i);
		}
		
		else if(arg0==b4){
			Intent i = new Intent(MainActivity.this,Activity_1_4.class);
			startActivity(i);
		}
	}

}
