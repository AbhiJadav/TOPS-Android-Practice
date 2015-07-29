package com.example.calculator;

import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("NewApi") public class Activity_1_1_1 extends Activity implements OnClickListener {

	Spinner grade1,credit1;
	Spinner grade2,credit2;
	Spinner grade3,credit3;
	Spinner grade4,credit4;
	Spinner grade5,credit5;
	Spinner grade6,credit6;
	Spinner grade7,credit7;
	Spinner grade8,credit8;
	Spinner grade9,credit9;

	TextView subject1,subject2,subject3,subject4,subject5,subject6,subject7,subject8,subject9;

	Button ok_spi,clear_spi;
	int total_subjects;

	String[] grades={"AA","AB","BB","BC","CC","CD","DD","FF"};
	String[] credits={"6","5","4","3","2","1"};
	HintAdapter adapter_grade,adapter_credit;
	String hint_Grade="Grade";
	String hint_Credit="Credit";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_1_1);

		Intent i = getIntent();
		total_subjects=i.getIntExtra("final", 0);

		ok_spi=(Button)findViewById(R.id.ok_spi);
		clear_spi=(Button)findViewById(R.id.cancel_spi);

		subject1=(TextView)findViewById(R.id.subject1);
		subject2=(TextView)findViewById(R.id.subject2);
		subject3=(TextView)findViewById(R.id.subject3);
		subject4=(TextView)findViewById(R.id.subject4);
		subject5=(TextView)findViewById(R.id.subject5);
		subject6=(TextView)findViewById(R.id.subject6);
		subject7=(TextView)findViewById(R.id.subject7);
		subject8=(TextView)findViewById(R.id.subject8);
		subject9=(TextView)findViewById(R.id.subject9);

		grade1=(Spinner)findViewById(R.id.grade_sub1);
		grade2=(Spinner)findViewById(R.id.grade_sub2);
		grade3=(Spinner)findViewById(R.id.grade_sub3);
		grade4=(Spinner)findViewById(R.id.grade_sub4);
		grade5=(Spinner)findViewById(R.id.grade_sub5);
		grade6=(Spinner)findViewById(R.id.grade_sub6);
		grade7=(Spinner)findViewById(R.id.grade_sub7);
		grade8=(Spinner)findViewById(R.id.grade_sub8);
		grade9=(Spinner)findViewById(R.id.grade_sub9);

		credit1=(Spinner)findViewById(R.id.credit_sub1);
		credit2=(Spinner)findViewById(R.id.credit_sub2);
		credit3=(Spinner)findViewById(R.id.credit_sub3);
		credit4=(Spinner)findViewById(R.id.credit_sub4);
		credit5=(Spinner)findViewById(R.id.credit_sub5);
		credit6=(Spinner)findViewById(R.id.credit_sub6);
		credit7=(Spinner)findViewById(R.id.credit_sub7);
		credit8=(Spinner)findViewById(R.id.credit_sub8);
		credit9=(Spinner)findViewById(R.id.credit_sub9);

		adapter_grade=new HintAdapter(Activity_1_1_1.this, android.R.layout.simple_list_item_1);
		adapter_grade.addAll(grades);
		adapter_grade.add(hint_Grade);

		adapter_credit=new HintAdapter(Activity_1_1_1.this, android.R.layout.simple_list_item_1);
		adapter_credit.addAll(credits);
		adapter_credit.add(hint_Credit);

		switch (total_subjects) {

		case 4:

			subject5.setVisibility(View.INVISIBLE);
			subject6.setVisibility(View.INVISIBLE);
			subject7.setVisibility(View.INVISIBLE);
			subject8.setVisibility(View.INVISIBLE);
			subject9.setVisibility(View.INVISIBLE);

			grade5.setVisibility(View.INVISIBLE);
			grade6.setVisibility(View.INVISIBLE);
			grade7.setVisibility(View.INVISIBLE);
			grade8.setVisibility(View.INVISIBLE);
			grade9.setVisibility(View.INVISIBLE);

			credit5.setVisibility(View.INVISIBLE);
			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);
			credit9.setVisibility(View.INVISIBLE);

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());

			break;

		case 5:		

			subject6.setVisibility(View.INVISIBLE);
			subject7.setVisibility(View.INVISIBLE);
			subject8.setVisibility(View.INVISIBLE);
			subject9.setVisibility(View.INVISIBLE);

			grade6.setVisibility(View.INVISIBLE);
			grade7.setVisibility(View.INVISIBLE);
			grade8.setVisibility(View.INVISIBLE);
			grade9.setVisibility(View.INVISIBLE);

			credit6.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);
			credit9.setVisibility(View.INVISIBLE);

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());
			grade5.setAdapter(adapter_grade);
			grade5.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());
			credit5.setAdapter(adapter_credit);
			credit5.setSelection(adapter_credit.getCount());

			break;

		case 6:

			subject7.setVisibility(View.INVISIBLE);
			subject8.setVisibility(View.INVISIBLE);
			subject9.setVisibility(View.INVISIBLE);

			grade7.setVisibility(View.INVISIBLE);
			grade8.setVisibility(View.INVISIBLE);
			grade9.setVisibility(View.INVISIBLE);

			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);
			credit9.setVisibility(View.INVISIBLE);

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());
			grade5.setAdapter(adapter_grade);
			grade5.setSelection(adapter_grade.getCount());
			grade6.setAdapter(adapter_grade);
			grade6.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());
			credit5.setAdapter(adapter_credit);
			credit5.setSelection(adapter_credit.getCount());
			credit6.setAdapter(adapter_credit);
			credit6.setSelection(adapter_credit.getCount());

			break;

		case 7:

			subject8.setVisibility(View.INVISIBLE);
			subject9.setVisibility(View.INVISIBLE);

			grade8.setVisibility(View.INVISIBLE);
			grade9.setVisibility(View.INVISIBLE);

			credit8.setVisibility(View.INVISIBLE);
			credit9.setVisibility(View.INVISIBLE);

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());
			grade5.setAdapter(adapter_grade);
			grade5.setSelection(adapter_grade.getCount());
			grade6.setAdapter(adapter_grade);
			grade6.setSelection(adapter_grade.getCount());
			grade7.setAdapter(adapter_grade);
			grade7.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());
			credit5.setAdapter(adapter_credit);
			credit5.setSelection(adapter_credit.getCount());
			credit6.setAdapter(adapter_credit);
			credit6.setSelection(adapter_credit.getCount());
			credit7.setAdapter(adapter_credit);
			credit7.setSelection(adapter_credit.getCount());

			break;

		case 8:

			subject9.setVisibility(View.INVISIBLE);

			grade9.setVisibility(View.INVISIBLE);

			credit9.setVisibility(View.INVISIBLE);

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());
			grade5.setAdapter(adapter_grade);
			grade5.setSelection(adapter_grade.getCount());
			grade6.setAdapter(adapter_grade);
			grade6.setSelection(adapter_grade.getCount());
			grade7.setAdapter(adapter_grade);
			grade7.setSelection(adapter_grade.getCount());
			grade8.setAdapter(adapter_grade);
			grade8.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());
			credit5.setAdapter(adapter_credit);
			credit5.setSelection(adapter_credit.getCount());
			credit6.setAdapter(adapter_credit);
			credit6.setSelection(adapter_credit.getCount());
			credit7.setAdapter(adapter_credit);
			credit7.setSelection(adapter_credit.getCount());
			credit8.setAdapter(adapter_credit);
			credit8.setSelection(adapter_credit.getCount());
			break;

		case 9:

			grade1.setAdapter(adapter_grade);
			grade1.setSelection(adapter_grade.getCount());
			grade2.setAdapter(adapter_grade);
			grade2.setSelection(adapter_grade.getCount());
			grade3.setAdapter(adapter_grade);
			grade3.setSelection(adapter_grade.getCount());
			grade4.setAdapter(adapter_grade);
			grade4.setSelection(adapter_grade.getCount());
			grade5.setAdapter(adapter_grade);
			grade5.setSelection(adapter_grade.getCount());
			grade6.setAdapter(adapter_grade);
			grade6.setSelection(adapter_grade.getCount());
			grade7.setAdapter(adapter_grade);
			grade7.setSelection(adapter_grade.getCount());
			grade8.setAdapter(adapter_grade);
			grade8.setSelection(adapter_grade.getCount());
			grade9.setAdapter(adapter_grade);
			grade9.setSelection(adapter_grade.getCount());

			credit1.setAdapter(adapter_credit);
			credit1.setSelection(adapter_credit.getCount());
			credit2.setAdapter(adapter_credit);
			credit2.setSelection(adapter_credit.getCount());
			credit3.setAdapter(adapter_credit);
			credit3.setSelection(adapter_credit.getCount());
			credit4.setAdapter(adapter_credit);
			credit4.setSelection(adapter_credit.getCount());
			credit5.setAdapter(adapter_credit);
			credit5.setSelection(adapter_credit.getCount());
			credit6.setAdapter(adapter_credit);
			credit6.setSelection(adapter_credit.getCount());
			credit7.setAdapter(adapter_credit);
			credit7.setSelection(adapter_credit.getCount());
			credit8.setAdapter(adapter_credit);
			credit8.setSelection(adapter_credit.getCount());
			credit9.setAdapter(adapter_credit);
			credit9.setSelection(adapter_credit.getCount());

			break;

		default :

			break;
		}

		ok_spi.setOnClickListener(Activity_1_1_1.this);
		clear_spi.setOnClickListener(Activity_1_1_1.this);


	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub

		if(arg0==ok_spi){

			List<String> string_list;
			List<Integer> integer_list;

			String grade1_string,grade2_string,grade3_string,grade4_string,grade5_string,grade6_string,grade7_string,grade8_string,grade9_string;
			int credit1_int,credit2_int,credit3_int,credit4_int,credit5_int,credit6_int,credit7_int,credit8_int,credit9_int;

			switch (total_subjects) {

			case 4:

				try{

					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade")){
						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();

						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());

						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);

					}	else{
						Exception e=new Exception();
						throw e;
					}	
				}	catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}

				break;

			case 5:

				try{
					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade") && !grade5.equals("Grade")){

						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();
						grade5_string=grade5.getSelectedItem().toString();

						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());
						credit5_int=Integer.parseInt(credit5.getSelectedItem().toString());


						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);
						string_list.add(grade5_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);
						integer_list.add(credit5_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);
					} 	else{
						Exception e=new Exception();
						throw e;
					}
				}	catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}	
				break;

			case 6:

				try{
					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade") && !grade5.equals("Grade") && !grade6.equals("Grade")){

						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();
						grade5_string=grade5.getSelectedItem().toString();
						grade6_string=grade6.getSelectedItem().toString();

						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());
						credit5_int=Integer.parseInt(credit5.getSelectedItem().toString());
						credit6_int=Integer.parseInt(credit6.getSelectedItem().toString());


						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);
						string_list.add(grade5_string);
						string_list.add(grade6_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);
						integer_list.add(credit5_int);
						integer_list.add(credit6_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);
					} else {
						Exception e=new Exception();
						throw e;
					}
				} catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}

				break;

			case 7:

				try{
					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade") && !grade5.equals("Grade") && !grade6.equals("Grade") && !grade7.equals("Grade")){

						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();
						grade5_string=grade5.getSelectedItem().toString();
						grade6_string=grade6.getSelectedItem().toString();
						grade7_string=grade7.getSelectedItem().toString();

						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());
						credit5_int=Integer.parseInt(credit5.getSelectedItem().toString());
						credit6_int=Integer.parseInt(credit6.getSelectedItem().toString());
						credit7_int=Integer.parseInt(credit7.getSelectedItem().toString());


						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);
						string_list.add(grade5_string);
						string_list.add(grade6_string);
						string_list.add(grade7_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);
						integer_list.add(credit5_int);
						integer_list.add(credit6_int);
						integer_list.add(credit7_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);

					} else {
						Exception e=new Exception();
						throw e;
					}
				}	catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}

				break;

			case 8:

				try{
					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade") && !grade5.equals("Grade") && !grade6.equals("Grade") && !grade7.equals("Grade") && !grade8.equals("Grade")){

						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();
						grade5_string=grade5.getSelectedItem().toString();
						grade6_string=grade6.getSelectedItem().toString();
						grade7_string=grade7.getSelectedItem().toString();
						grade8_string=grade8.getSelectedItem().toString();

						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());
						credit5_int=Integer.parseInt(credit5.getSelectedItem().toString());
						credit6_int=Integer.parseInt(credit6.getSelectedItem().toString());
						credit7_int=Integer.parseInt(credit7.getSelectedItem().toString());
						credit8_int=Integer.parseInt(credit8.getSelectedItem().toString());

						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);
						string_list.add(grade5_string);
						string_list.add(grade6_string);
						string_list.add(grade7_string);
						string_list.add(grade8_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);
						integer_list.add(credit5_int);
						integer_list.add(credit6_int);
						integer_list.add(credit7_int);
						integer_list.add(credit8_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);
					}	else{
						Exception e=new Exception();
						throw e;
					}
				} catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}

				break;

			case 9:
				try{
					if(!grade1.getSelectedItem().equals("Grade") && !grade2.getSelectedItem().equals("Grade") && !grade3.getSelectedItem().equals("Grade") && !grade4.getSelectedItem().equals("Grade") && !grade5.equals("Grade") && !grade6.equals("Grade") && !grade7.equals("Grade") && !grade8.equals("Grade") && !grade9.equals("Grade")){


						grade1_string=grade1.getSelectedItem().toString();
						grade2_string=grade2.getSelectedItem().toString();
						grade3_string=grade3.getSelectedItem().toString();
						grade4_string=grade4.getSelectedItem().toString();
						grade5_string=grade5.getSelectedItem().toString();
						grade6_string=grade6.getSelectedItem().toString();
						grade7_string=grade7.getSelectedItem().toString();
						grade8_string=grade8.getSelectedItem().toString();
						grade9_string=grade9.getSelectedItem().toString();


						credit1_int=Integer.parseInt(credit1.getSelectedItem().toString());
						credit2_int=Integer.parseInt(credit2.getSelectedItem().toString());
						credit3_int=Integer.parseInt(credit3.getSelectedItem().toString());
						credit4_int=Integer.parseInt(credit4.getSelectedItem().toString());
						credit5_int=Integer.parseInt(credit5.getSelectedItem().toString());
						credit6_int=Integer.parseInt(credit6.getSelectedItem().toString());
						credit7_int=Integer.parseInt(credit7.getSelectedItem().toString());
						credit8_int=Integer.parseInt(credit8.getSelectedItem().toString());
						credit9_int=Integer.parseInt(credit9.getSelectedItem().toString());


						string_list=new ArrayList<String>();
						string_list.add(grade1_string);
						string_list.add(grade2_string);
						string_list.add(grade3_string);
						string_list.add(grade4_string);
						string_list.add(grade5_string);
						string_list.add(grade6_string);
						string_list.add(grade7_string);
						string_list.add(grade8_string);
						string_list.add(grade9_string);

						integer_list=new ArrayList<Integer>();
						integer_list.add(credit1_int);
						integer_list.add(credit2_int);
						integer_list.add(credit3_int);
						integer_list.add(credit4_int);
						integer_list.add(credit5_int);
						integer_list.add(credit6_int);
						integer_list.add(credit7_int);
						integer_list.add(credit8_int);
						integer_list.add(credit9_int);

						Calculate_SPI ob= new Calculate_SPI(string_list,integer_list,total_subjects);
						ob.getMultipliers();
						ob.Calculate();
						ob.show(Activity_1_1_1.this);

					}	else{
						Exception e = new Exception();
						throw e;
					}
				}	catch(Exception e) {
					Toast.makeText(Activity_1_1_1.this, "Insufficient details", Toast.LENGTH_LONG).show();
				}

				break;

			default:

				break;

			}
		}
		else if(arg0==clear_spi){

			grade1.setSelection(adapter_grade.getCount());
			grade2.setSelection(adapter_grade.getCount());
			grade3.setSelection(adapter_grade.getCount());
			grade4.setSelection(adapter_grade.getCount());
			grade5.setSelection(adapter_grade.getCount());
			grade6.setSelection(adapter_grade.getCount());
			grade7.setSelection(adapter_grade.getCount());
			grade8.setSelection(adapter_grade.getCount());
			grade9.setSelection(adapter_grade.getCount());

			credit1.setSelection(adapter_credit.getCount());
			credit2.setSelection(adapter_credit.getCount());
			credit3.setSelection(adapter_credit.getCount());
			credit4.setSelection(adapter_credit.getCount());
			credit5.setSelection(adapter_credit.getCount());
			credit6.setSelection(adapter_credit.getCount());
			credit7.setSelection(adapter_credit.getCount());
			credit8.setSelection(adapter_credit.getCount());
			credit9.setSelection(adapter_credit.getCount());

		}
	}
}
