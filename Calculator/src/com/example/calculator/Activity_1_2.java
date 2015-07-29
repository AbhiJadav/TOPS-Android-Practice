package com.example.calculator;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class Activity_1_2 extends Activity implements OnClickListener {

	Spinner sp;
	HintAdapter adapter;
	Button b1,b2;
	String hint="Select number of semesters";
	String[] numbers={"1","2","3","4","5","6","7","8"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_2);

		sp=(Spinner)findViewById(R.id.choose_semesters);
		b1=(Button)findViewById(R.id.ok_choosing_semesters);
		b2=(Button)findViewById(R.id.cancel_choosing_semesters);

		adapter = new HintAdapter(Activity_1_2.this, android.R.layout.simple_list_item_1);
		adapter.addAll(numbers);
		adapter.add(hint);
		sp.setAdapter(adapter);
		sp.setSelection(adapter.getCount());

		b1.setOnClickListener(Activity_1_2.this);
		b2.setOnClickListener(Activity_1_2.this);

	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		if(arg0==b1){
			
			if(sp.getSelectedItemId()==0){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 1 ;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}

			else if(sp.getSelectedItemId()==1){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 2;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}

			else if(sp.getSelectedItemId()==2){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 3;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}

			else if(sp.getSelectedItemId()==3){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 4;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}

			else if(sp.getSelectedItemId()==4){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 5;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}

			else if(sp.getSelectedItemId()==5){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 6;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}
			else if(sp.getSelectedItemId()==6){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters = 7;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}
			else if(sp.getSelectedItemId()==7){
				Intent i = new Intent(Activity_1_2.this,Activity_1_2_1.class);
				final int total_semesters  = 8;
				i.putExtra("final", total_semesters);
				startActivity(i);
				sp.setSelection(adapter.getCount());
			}
			else{

			}
		}

		else if(arg0==b2){
			finish();
		}
	}

}
