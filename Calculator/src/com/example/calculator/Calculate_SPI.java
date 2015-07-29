package com.example.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


public class Calculate_SPI {

	List<String> string_list;
	List<Integer> integer_list;
	List<Integer> list_mul1= new ArrayList<Integer>();
	List<Integer> list_mul2= new ArrayList<Integer>();
	int mul1 = 0 , mul2 = 0 , total_subjects ;
	public float spi;
	float sum , credit;

	public Calculate_SPI() {
		// TODO Auto-generated constructor stub
	}

	Calculate_SPI(List<String> string_list,List<Integer> integer_list,int total_subjects){
		this.string_list=string_list;
		this.integer_list=integer_list;
		this.total_subjects=total_subjects;
	}

	void getMultipliers() {
		// TODO Auto-generated method stub

		for(String s : string_list){

			if(s.equals("AA")){
				mul1=10;
			}
			else if(s.equals("AB")){
				mul1=9;
			}
			else if(s.equals("BB")){
				mul1=8;
			}
			else if(s.equals("BC")){
				mul1=7;
			}
			else if(s.equals("CC")){
				mul1=6;
			}
			else if(s.equals("CD")){
				mul1=5;
			}
			else if(s.equals("DD")){
				mul1=4;
			}
			else if(s.equals("FF")){
				mul1=0;
			}

			list_mul1.add(mul1);
		}

		for( int i : integer_list){
			list_mul2.add(i);
		}

	}

	public static Float precision(int decimalPlace, Float d) {

	    BigDecimal bd = new BigDecimal(Float.toString(d));
	    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
	    return bd.floatValue();
	  }

	void Calculate() {
		// TODO Auto-generated method stub


		for(int i=0	;	i<total_subjects	;	i++	){
			sum+=list_mul1.get(i)*list_mul2.get(i);
			credit+=list_mul2.get(i);
		}
		
		spi=precision(2, (sum/credit));

	}

	void show(Context context){
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

		// set title
		alertDialogBuilder.setTitle("Result");

		// set dialog message
		alertDialogBuilder.setMessage("Your SPI is "+spi);
		alertDialogBuilder.setNegativeButton("OK",new DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog,int id) {
				// if this button is clicked, just close
				// the dialog box and do nothing
				dialog.cancel();
			}
		});

		// create alert dialog
		AlertDialog alertDialog = alertDialogBuilder.create();

		// show it
		alertDialog.show();
	}

}
