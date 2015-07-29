package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_1_2_1 extends Activity implements OnClickListener {

	EditText spi1,credit1;
	EditText spi2,credit2;
	EditText spi3,credit3;
	EditText spi4,credit4;
	EditText spi5,credit5;
	EditText spi6,credit6;
	EditText spi7,credit7;
	EditText spi8,credit8;

	TextView semester1,semester2,semester3,semester4,semester5,semester6,semester7,semester8;

	Button ok_cpi,clear_cpi;
	int total_semesters;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_2_1);

		Intent i = getIntent();
		total_semesters=i.getIntExtra("final", 0);

		ok_cpi=(Button)findViewById(R.id.ok_cpi);
		clear_cpi=(Button)findViewById(R.id.cancel_cpi);

		semester1=(TextView)findViewById(R.id.semester1);
		semester2=(TextView)findViewById(R.id.semester2);
		semester3=(TextView)findViewById(R.id.semester3);
		semester4=(TextView)findViewById(R.id.semester4);
		semester5=(TextView)findViewById(R.id.semester5);
		semester6=(TextView)findViewById(R.id.semester6);
		semester7=(TextView)findViewById(R.id.semester7);
		semester8=(TextView)findViewById(R.id.semester8);

		spi1=(EditText)findViewById(R.id.ed_spi_sem1);
		spi2=(EditText)findViewById(R.id.ed_spi_sem2);
		spi3=(EditText)findViewById(R.id.ed_spi_sem3);
		spi4=(EditText)findViewById(R.id.ed_spi_sem4);
		spi5=(EditText)findViewById(R.id.ed_spi_sem5);
		spi6=(EditText)findViewById(R.id.ed_spi_sem6);
		spi7=(EditText)findViewById(R.id.ed_spi_sem7);
		spi8=(EditText)findViewById(R.id.ed_spi_sem8);

		credit1=(EditText)findViewById(R.id.ed_credit_sem1);
		credit2=(EditText)findViewById(R.id.ed_credit_sem2);
		credit3=(EditText)findViewById(R.id.ed_credit_sem3);
		credit4=(EditText)findViewById(R.id.ed_credit_sem4);
		credit5=(EditText)findViewById(R.id.ed_credit_sem5);
		credit6=(EditText)findViewById(R.id.ed_credit_sem6);
		credit7=(EditText)findViewById(R.id.ed_credit_sem7);
		credit8=(EditText)findViewById(R.id.ed_credit_sem8);

		switch (total_semesters) {

		case 1:

			semester2.setVisibility(View.INVISIBLE);
			semester3.setVisibility(View.INVISIBLE);
			semester4.setVisibility(View.INVISIBLE);
			semester5.setVisibility(View.INVISIBLE);
			semester6.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi2.setVisibility(View.INVISIBLE);
			spi3.setVisibility(View.INVISIBLE);
			spi4.setVisibility(View.INVISIBLE);
			spi5.setVisibility(View.INVISIBLE);
			spi6.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit2.setVisibility(View.INVISIBLE);
			credit3.setVisibility(View.INVISIBLE);
			credit4.setVisibility(View.INVISIBLE);
			credit5.setVisibility(View.INVISIBLE);
			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 2:

			semester3.setVisibility(View.INVISIBLE);
			semester4.setVisibility(View.INVISIBLE);
			semester5.setVisibility(View.INVISIBLE);
			semester6.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi3.setVisibility(View.INVISIBLE);
			spi4.setVisibility(View.INVISIBLE);
			spi5.setVisibility(View.INVISIBLE);
			spi6.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit3.setVisibility(View.INVISIBLE);
			credit4.setVisibility(View.INVISIBLE);
			credit5.setVisibility(View.INVISIBLE);
			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 3:

			semester4.setVisibility(View.INVISIBLE);
			semester5.setVisibility(View.INVISIBLE);
			semester6.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi4.setVisibility(View.INVISIBLE);
			spi5.setVisibility(View.INVISIBLE);
			spi6.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit4.setVisibility(View.INVISIBLE);
			credit5.setVisibility(View.INVISIBLE);
			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 4:

			semester5.setVisibility(View.INVISIBLE);
			semester6.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi5.setVisibility(View.INVISIBLE);
			spi6.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit5.setVisibility(View.INVISIBLE);
			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 5:

			semester6.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi6.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);



			break;

		case 6:

			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);


			break;

		case 7:

			semester8.setVisibility(View.INVISIBLE);

			spi8.setVisibility(View.INVISIBLE);

			credit8.setVisibility(View.INVISIBLE);


			break;

		case 8:

			break;

		default:
			break;
		}

		ok_cpi.setOnClickListener(Activity_1_2_1.this);
		clear_cpi.setOnClickListener(Activity_1_2_1.this);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		List<Float> float_list1;
		List<Integer> integer_list2;
		float spi1_float,spi2_float,spi3_float,spi4_float,spi5_float,spi6_float,spi7_float,spi8_float;
		int credit1_int,credit2_int,credit3_int,credit4_int,credit5_int,credit6_int,credit7_int,credit8_int;

		if(v==ok_cpi){

			switch (total_semesters) {

			case 1:

				try {

					if(!spi1.getText().toString().equals("") && !credit1.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						credit1_int=Integer.parseInt(credit1.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}

				break;

			case 2:

				try{
					if(!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);

					} 	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				}	catch (Exception e) {

					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}
				break;

			case 3:

				try{
					if (!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")) {

						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}	

				break;

			case 4:

				try{
					if(!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !spi4.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")&& !credit4.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());
						spi4_float=Float.parseFloat(spi4.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());
						credit4_int=Integer.parseInt(credit4.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);
						float_list1.add(spi4_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);
						integer_list2.add(credit4_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}	
				break;

			case 5:

				try{
					if(!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !spi4.getText().toString().equals("") && !spi5.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")&& !credit4.getText().toString().equals("")&& !credit5.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());
						spi4_float=Float.parseFloat(spi4.getText().toString());
						spi5_float=Float.parseFloat(spi5.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());
						credit4_int=Integer.parseInt(credit4.getText().toString());
						credit5_int=Integer.parseInt(credit5.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);
						float_list1.add(spi4_float);
						float_list1.add(spi5_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);
						integer_list2.add(credit4_int);
						integer_list2.add(credit5_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}

				break;

			case 6:

				try{
					if (!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !spi4.getText().toString().equals("") && !spi5.getText().toString().equals("") && !spi6.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")&& !credit4.getText().toString().equals("")&& !credit5.getText().toString().equals("")) {

						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());
						spi4_float=Float.parseFloat(spi4.getText().toString());
						spi5_float=Float.parseFloat(spi5.getText().toString());
						spi6_float=Float.parseFloat(spi6.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());
						credit4_int=Integer.parseInt(credit4.getText().toString());
						credit5_int=Integer.parseInt(credit5.getText().toString());
						credit6_int=Integer.parseInt(credit6.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);
						float_list1.add(spi4_float);
						float_list1.add(spi5_float);
						float_list1.add(spi6_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);
						integer_list2.add(credit4_int);
						integer_list2.add(credit5_int);
						integer_list2.add(credit6_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}	

				break;

			case 7:
				try{
					if(!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !spi4.getText().toString().equals("") && !spi5.getText().toString().equals("") && !spi6.getText().toString().equals("") && !spi7.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")&& !credit4.getText().toString().equals("")&& !credit5.getText().toString().equals("")&& !credit6.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());
						spi4_float=Float.parseFloat(spi4.getText().toString());
						spi5_float=Float.parseFloat(spi5.getText().toString());
						spi6_float=Float.parseFloat(spi6.getText().toString());
						spi7_float=Float.parseFloat(spi7.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());
						credit4_int=Integer.parseInt(credit4.getText().toString());
						credit5_int=Integer.parseInt(credit5.getText().toString());
						credit6_int=Integer.parseInt(credit6.getText().toString());
						credit7_int=Integer.parseInt(credit7.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);
						float_list1.add(spi4_float);
						float_list1.add(spi5_float);
						float_list1.add(spi6_float);
						float_list1.add(spi7_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);
						integer_list2.add(credit4_int);
						integer_list2.add(credit5_int);
						integer_list2.add(credit6_int);
						integer_list2.add(credit7_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}	

				break;

			case 8:

				try{
					if(!spi1.getText().toString().equals("") && !spi2.getText().toString().equals("") && !spi3.getText().toString().equals("") && !spi4.getText().toString().equals("") && !spi5.getText().toString().equals("") && !spi6.getText().toString().equals("") && !spi7.getText().toString().equals("") && !spi8.getText().toString().equals("") && !credit1.getText().toString().equals("")&& !credit2.getText().toString().equals("")&& !credit3.getText().toString().equals("")&& !credit4.getText().toString().equals("")&& !credit5.getText().toString().equals("")&& !credit6.getText().toString().equals("")&& !credit7.getText().toString().equals("")&& !credit8.getText().toString().equals("")){
						spi1_float=Float.parseFloat(spi1.getText().toString());
						spi2_float=Float.parseFloat(spi2.getText().toString());
						spi3_float=Float.parseFloat(spi3.getText().toString());
						spi4_float=Float.parseFloat(spi4.getText().toString());
						spi5_float=Float.parseFloat(spi5.getText().toString());
						spi6_float=Float.parseFloat(spi6.getText().toString());
						spi7_float=Float.parseFloat(spi7.getText().toString());
						spi8_float=Float.parseFloat(spi8.getText().toString());

						credit1_int=Integer.parseInt(credit1.getText().toString());
						credit2_int=Integer.parseInt(credit2.getText().toString());
						credit3_int=Integer.parseInt(credit3.getText().toString());
						credit4_int=Integer.parseInt(credit4.getText().toString());
						credit5_int=Integer.parseInt(credit5.getText().toString());
						credit6_int=Integer.parseInt(credit6.getText().toString());
						credit7_int=Integer.parseInt(credit7.getText().toString());
						credit8_int=Integer.parseInt(credit8.getText().toString());

						float_list1= new ArrayList<Float>();
						float_list1.add(spi1_float);
						float_list1.add(spi2_float);
						float_list1.add(spi3_float);
						float_list1.add(spi4_float);
						float_list1.add(spi5_float);
						float_list1.add(spi6_float);
						float_list1.add(spi7_float);
						float_list1.add(spi8_float);

						integer_list2=new ArrayList<Integer>();
						integer_list2.add(credit1_int);
						integer_list2.add(credit2_int);
						integer_list2.add(credit3_int);
						integer_list2.add(credit4_int);
						integer_list2.add(credit5_int);
						integer_list2.add(credit6_int);
						integer_list2.add(credit7_int);
						integer_list2.add(credit8_int);

						Calculate_CPI ob= new Calculate_CPI(float_list1,integer_list2,total_semesters);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_2_1.this);
					}	else{
						Toast.makeText(Activity_1_2_1.this, "Insufficient Details", Toast.LENGTH_LONG).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(Activity_1_2_1.this, "Invalid details",Toast.LENGTH_LONG).show();
				}			
				break;

			default:
				break;
			}
		}

		else if(v==clear_cpi){

			spi1.setText("");
			spi2.setText("");
			spi3.setText("");
			spi4.setText("");
			spi5.setText("");
			spi6.setText("");
			spi7.setText("");
			spi8.setText("");

			credit1.setText("");
			credit2.setText("");
			credit3.setText("");
			credit4.setText("");
			credit5.setText("");
			credit6.setText("");
			credit7.setText("");
			credit8.setText("");

		}
	}
}
