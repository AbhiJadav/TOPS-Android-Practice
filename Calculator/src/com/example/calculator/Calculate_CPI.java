package com.example.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class Calculate_CPI {

	List<Float> float_list1;
	List<Integer> integer_list2;
	List<Float> list_sum1=new ArrayList<Float>();
	List<Integer> list_sum2=new ArrayList<Integer>();
	float sum = 0, credit = 0;
	int total_semesters;
	public float cpi;


	public Calculate_CPI() {
		// TODO Auto-generated constructor stub
	}

	Calculate_CPI(List<Float> float_list1,List<Integer> integer_list2,int total_semesters){
		this.float_list1=float_list1;
		this.integer_list2=integer_list2;
		this.total_semesters=total_semesters;
	}

	public void getMultipliers() {
		// TODO Auto-generated method stub

		for(float a : float_list1){
			list_sum1.add(a);
			System.out.println(a+">>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		}

		for(int b : integer_list2){
			list_sum2.add(b);
			System.out.println(b+">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}

	}

	public static Float precision(int decimalPlace, Float d) {

		BigDecimal bd = new BigDecimal(Float.toString(d));
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}


	public void Calculate() {
		// TODO Auto-generated method stub
		for (int i = 0; i < total_semesters; i++) {

			sum+=(list_sum1.get(i)*list_sum2.get(i));
			credit+=list_sum2.get(i);
			
			System.out.println(sum+"["+i+"]"+">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println(credit+"["+i+"]"+">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}

		cpi=precision(2, (sum/credit));
		System.out.println(cpi+">>>>>>>>>>>>>>>>>>>>>>");
	}

	public void show(Context context) {
		// TODO Auto-generated method stub
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

		// set title
		alertDialogBuilder.setTitle("Result");

		// set dialog message
		alertDialogBuilder.setMessage("Your CPI is "+cpi);
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
