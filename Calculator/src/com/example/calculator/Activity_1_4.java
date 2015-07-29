package com.example.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

@SuppressLint("NewApi")
public class Activity_1_4 extends Activity implements OnClickListener {
	Spinner sp,sp_disable;
	Spinner degree;
	HintAdapter adapter,adapter_disable;
	Button b1,b2;
	String hint="Choose your current semester";
	String hint_degree="Choose your course first";
	String[] numbers_degree={"Diploma Pharmacy","Diploma Engineering","PDDC","BE","ME","BCA","MCA","B.Pharm","M.Pharm","MBA"};
	String[] numbers_4={"1","2","3","4","Passed out"};
	String[] numbers_6={"1","2","3","4","5","6","Passed out"};
	String[] numbers_8={"1","2","3","4","5","6","7","8","Passed out"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_4);

		sp=(Spinner)findViewById(R.id.choose_degree);
		sp_disable=(Spinner)findViewById(R.id.choose_current_semester);
		b1=(Button)findViewById(R.id.ok_current_semester);
		b2=(Button)findViewById(R.id.cancel_current_semester);

		adapter_disable = new HintAdapter(Activity_1_4.this, android.R.layout.simple_list_item_1);
		sp_disable.setAdapter(adapter_disable);
		sp_disable.setEnabled(false);

		adapter = new HintAdapter(Activity_1_4.this, android.R.layout.simple_list_item_1);
		adapter.addAll(numbers_degree);
		adapter.add(hint_degree);
		sp.setAdapter(adapter);
		sp.setSelection(adapter.getCount());

		adapter_disable.addAll(numbers_8);
		adapter_disable.add(hint);
		sp_disable.setAdapter(adapter_disable);
		sp_disable.setSelection(adapter_disable.getCount());

		b1.setOnClickListener(Activity_1_4.this);
		b2.setOnClickListener(Activity_1_4.this);
		sp.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(sp.getSelectedItem()=="Diploma Engineering"|| sp.getSelectedItem()=="Diploma Pharmacy" || sp.getSelectedItem()=="MCA" || sp.getSelectedItem()=="BCA" ){

					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_6);
					adapter_disable.add(hint_degree);
					sp_disable.setSelection(adapter_disable.getCount());
					sp_disable.setEnabled(true);
					sp.setEnabled(false);

				}
				else if(sp.getSelectedItem()=="BE"|| sp.getSelectedItem()=="B.Pharm" || sp.getSelectedItem()=="PDDC"){

					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint_degree);
					sp_disable.setSelection(adapter_disable.getCount());
					sp_disable.setEnabled(true);
					sp.setEnabled(false);
					
				}
				else if( sp.getSelectedItem()=="ME" || sp.getSelectedItem()=="MBA" || sp.getSelectedItem()=="M.Pharm" ){

					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_4);
					adapter_disable.add(hint_degree);
					sp_disable.setSelection(adapter_disable.getCount());
					sp_disable.setEnabled(true);
					sp.setEnabled(false);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		if(arg0==b1 && !sp.isEnabled() && sp.getSelectedItem()!=hint_degree && sp_disable.isEnabled() && sp_disable.getSelectedItem()!=hint){


			if(sp_disable.getSelectedItem()=="1"){

				Toast.makeText(Activity_1_4.this, "Sorry you're not eligible to calculate CGPA", Toast.LENGTH_LONG).show();

			}

			else if(sp_disable.getSelectedItem()=="2"){

				if( sp.getSelectedItem()=="ME" || sp.getSelectedItem()=="MBA" || sp.getSelectedItem()=="M.Pharm" ){

					final int current_semester = 2 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint);
					sp_disable.setAdapter(adapter_disable);
					sp_disable.setSelection(adapter_disable.getCount());

				}
				else{
					Toast.makeText(Activity_1_4.this, "Sorry you're not eligible to calculate CGPA", Toast.LENGTH_LONG).show();
				}
			}

			else if(sp_disable.getSelectedItem()=="3"){

				if( sp.getSelectedItem()=="ME" || sp.getSelectedItem()=="MBA" || sp.getSelectedItem()=="M.Pharm" ){
					final int current_semester = 3 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());
					

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint);
					sp_disable.setAdapter(adapter_disable);
					sp_disable.setSelection(adapter_disable.getCount());

				}
				else{
					Toast.makeText(Activity_1_4.this, "Sorry you're not eligible to calculate CGPA", Toast.LENGTH_LONG).show();
				}
			}

			else if(sp_disable.getSelectedItem()=="4"){

				if( sp.getSelectedItem()=="ME" || sp.getSelectedItem()=="MBA" || sp.getSelectedItem()=="M.Pharm" ){
					final int current_semester = 4 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint);
					sp_disable.setAdapter(adapter_disable);
					sp_disable.setSelection(adapter_disable.getCount());

				}
				else{
					Toast.makeText(Activity_1_4.this, "Sorry you're not eligible to calculate CGPA", Toast.LENGTH_LONG).show();
				}
			}

			else if(sp_disable.getSelectedItem()=="5"){

				if(sp.getSelectedItem()=="Diploma Engineering"|| sp.getSelectedItem()=="Diploma Pharmacy" || sp.getSelectedItem()=="MCA" ||  sp.getSelectedItem()=="BCA" ){

					final int current_semester = 5 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint);
					sp_disable.setAdapter(adapter_disable);
					sp_disable.setSelection(adapter_disable.getCount());

				}
				else if( sp.getSelectedItem()=="ME" || sp.getSelectedItem()=="MBA" || sp.getSelectedItem()=="M.Pharm" ){
					final int current_semester = 4 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();

				}
				else{
					Toast.makeText(Activity_1_4.this, "Sorry you're not eligible to calculate CGPA", Toast.LENGTH_LONG).show();
				}

			}

			else if(sp_disable.getSelectedItem()=="6"){

				final int current_semester = 6 ;
				Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
				i.putExtra("final", current_semester);
				i.putExtra("selected_course", sp.getSelectedItem().toString());
				System.out.println(sp.getSelectedItem().toString());
				startActivity(i);
				sp.setEnabled(true);
				sp.setSelection(adapter.getCount());

				sp_disable.setSelection(sp_disable.getCount());
				sp_disable.setEnabled(false);
				adapter_disable.clear();
				adapter_disable.notifyDataSetChanged();
				adapter_disable.addAll(numbers_8);
				adapter_disable.add(hint);
				sp_disable.setAdapter(adapter_disable);
				sp_disable.setSelection(adapter_disable.getCount());

			}

			else if(sp_disable.getSelectedItem()=="7"){


					final int current_semester = 7 ;
					Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
					i.putExtra("final", current_semester);
					i.putExtra("selected_course", sp.getSelectedItem().toString());
					startActivity(i);
					sp.setEnabled(true);
					sp.setSelection(adapter.getCount());

					sp_disable.setSelection(sp_disable.getCount());
					sp_disable.setEnabled(false);
					adapter_disable.clear();
					adapter_disable.notifyDataSetChanged();
					adapter_disable.addAll(numbers_8);
					adapter_disable.add(hint);
					sp_disable.setAdapter(adapter_disable);
					sp_disable.setSelection(adapter_disable.getCount());

			}

			else if(sp_disable.getSelectedItem()=="8"){

				final int current_semester = 8 ;
				Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
				i.putExtra("final", current_semester);
				i.putExtra("selected_course", sp.getSelectedItem().toString());
				startActivity(i);
				sp.setEnabled(true);
				sp.setSelection(adapter.getCount());

				sp_disable.setSelection(sp_disable.getCount());
				sp_disable.setEnabled(false);
				adapter_disable.clear();
				adapter_disable.notifyDataSetChanged();
				adapter_disable.addAll(numbers_8);
				adapter_disable.add(hint);
				sp_disable.setAdapter(adapter_disable);
				sp_disable.setSelection(adapter_disable.getCount());

			}

			else if(sp_disable.getSelectedItem()=="Passed out"){
				final int current_semester = 9 ;
				Intent i = new Intent(Activity_1_4.this,Activity_1_4_1.class);
				i.putExtra("final", current_semester);
				i.putExtra("selected_course", sp.getSelectedItem().toString());
				startActivity(i);
				sp.setEnabled(true);
				sp.setSelection(adapter.getCount());

				sp_disable.setSelection(sp_disable.getCount());
				sp_disable.setEnabled(false);
				adapter_disable.clear();
				adapter_disable.notifyDataSetChanged();
				adapter_disable.addAll(numbers_8);
				adapter_disable.add(hint);
				sp_disable.setAdapter(adapter_disable);
				sp_disable.setSelection(adapter_disable.getCount());
			}
		}

	}


}
