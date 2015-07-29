package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class Activity_1_4_1 extends Activity {

	EditText spi1,credit1;
	EditText spi2,credit2;
	EditText spi3,credit3;
	EditText spi4,credit4;
	EditText spi5,credit5;
	EditText spi6,credit6;
	EditText spi7,credit7;
	EditText spi8,credit8;

	String selected_course;
	TextView semester1,semester2,semester3,semester4,semester5,semester6,semester7,semester8;

	Button ok_cpi,clear_cpi;
	int current_semester;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_4_1);

		Intent i = getIntent();
		this.current_semester=i.getIntExtra("final", 0);
		System.out.println(current_semester+"at getINtent>>>>>>>>>>>>");
		this.selected_course=i.getStringExtra("selected_course");
		System.out.println(this.selected_course);

		ok_cpi=(Button)findViewById(R.id.ok_cpi);
		clear_cpi=(Button)findViewById(R.id.cancel_cpi);

		semester1=(TextView)findViewById(R.id.semester1_cgpa);
		semester2=(TextView)findViewById(R.id.semester2_cgpa);
		semester3=(TextView)findViewById(R.id.semester3_cgpa);
		semester4=(TextView)findViewById(R.id.semester4_cgpa);
		semester5=(TextView)findViewById(R.id.semester5_cgpa);
		semester6=(TextView)findViewById(R.id.semester6_cgpa);
		semester7=(TextView)findViewById(R.id.semester7_cgpa);
		semester8=(TextView)findViewById(R.id.semester8_cgpa);

		spi1=(EditText)findViewById(R.id.ed_spi_sem1_cgpa);
		spi2=(EditText)findViewById(R.id.ed_spi_sem2_cgpa);
		spi3=(EditText)findViewById(R.id.ed_spi_sem3_cgpa);
		spi4=(EditText)findViewById(R.id.ed_spi_sem4_cgpa);
		spi5=(EditText)findViewById(R.id.ed_spi_sem5_cgpa);
		spi6=(EditText)findViewById(R.id.ed_spi_sem6_cgpa);
		spi7=(EditText)findViewById(R.id.ed_spi_sem7_cgpa);
		spi8=(EditText)findViewById(R.id.ed_spi_sem8_cgpa);

		credit1=(EditText)findViewById(R.id.ed_credit_sem1_cgpa);
		credit2=(EditText)findViewById(R.id.ed_credit_sem2_cgpa);
		credit3=(EditText)findViewById(R.id.ed_credit_sem3_cgpa);
		credit4=(EditText)findViewById(R.id.ed_credit_sem4_cgpa);
		credit5=(EditText)findViewById(R.id.ed_credit_sem5_cgpa);
		credit6=(EditText)findViewById(R.id.ed_credit_sem6_cgpa);
		credit7=(EditText)findViewById(R.id.ed_credit_sem7_cgpa);
		credit8=(EditText)findViewById(R.id.ed_credit_sem8_cgpa);

		switch (current_semester) {

		case 2:

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

		case 3:

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

		case 4:

			if(selected_course.equals("ME")||selected_course.equals("M.Pharm")||selected_course.equals("MBA")){

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

			}	else if(selected_course.equals("MCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester4.setVisibility(View.INVISIBLE);
				semester5.setVisibility(View.INVISIBLE);
				semester6.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);


				spi1.setEnabled(false);
				spi2.setEnabled(false);
				spi4.setEnabled(false);
				spi5.setEnabled(false);
				spi6.setEnabled(false);
				spi7.setEnabled(false);
				spi8.setEnabled(false);

				credit1.setEnabled(false);
				credit2.setEnabled(false);
				credit4.setEnabled(false);
				credit5.setEnabled(false);
				credit6.setEnabled(false);
				credit7.setEnabled(false);
				credit8.setEnabled(false);
			}

			break;

		case 5:



			if(selected_course.equals("MCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester5.setVisibility(View.INVISIBLE);
				semester6.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);

				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi5.setVisibility(View.INVISIBLE);
				spi6.setVisibility(View.INVISIBLE);
				spi7.setVisibility(View.INVISIBLE);
				spi8.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit5.setVisibility(View.INVISIBLE);
				credit6.setVisibility(View.INVISIBLE);
				credit7.setVisibility(View.INVISIBLE);
				credit8.setVisibility(View.INVISIBLE);
			}


			break;

		case 6:

			if(selected_course.equals("Diploma Engineering")||selected_course.equals("Diploma Pharmacy")||selected_course.equals("BCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester3.setVisibility(View.INVISIBLE);
				semester4.setVisibility(View.INVISIBLE);
				semester6.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);

				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi3.setVisibility(View.INVISIBLE);
				spi4.setVisibility(View.INVISIBLE);
				spi6.setVisibility(View.INVISIBLE);
				spi7.setVisibility(View.INVISIBLE);
				spi8.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit3.setVisibility(View.INVISIBLE);
				credit4.setVisibility(View.INVISIBLE);
				credit6.setVisibility(View.INVISIBLE);
				credit7.setVisibility(View.INVISIBLE);
				credit8.setVisibility(View.INVISIBLE);

			}	else if(selected_course.equals("MCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester6.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);


				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi6.setVisibility(View.INVISIBLE);
				spi7.setVisibility(View.INVISIBLE);
				spi8.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit6.setVisibility(View.INVISIBLE);
				credit7.setVisibility(View.INVISIBLE);
				credit8.setVisibility(View.INVISIBLE);

			}	else if(selected_course.equals("PDDC") || selected_course.equals("BE") || selected_course.equals("B.Pharm")){

				System.out.println("selectedcourse_6 is excecuted.");
				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester3.setVisibility(View.INVISIBLE);
				semester4.setVisibility(View.INVISIBLE);
				semester6.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);


				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi3.setVisibility(View.INVISIBLE);
				spi4.setVisibility(View.INVISIBLE);
				spi6.setVisibility(View.INVISIBLE);
				spi7.setVisibility(View.INVISIBLE);
				spi8.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit3.setVisibility(View.INVISIBLE);
				credit4.setVisibility(View.INVISIBLE);
				credit6.setVisibility(View.INVISIBLE);
				credit7.setVisibility(View.INVISIBLE);
				credit8.setVisibility(View.INVISIBLE);
			}


			break;

		case 7:

			semester1.setVisibility(View.INVISIBLE);
			semester2.setVisibility(View.INVISIBLE);
			semester3.setVisibility(View.INVISIBLE);
			semester4.setVisibility(View.INVISIBLE);
			semester7.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);

			spi1.setVisibility(View.INVISIBLE);
			spi2.setVisibility(View.INVISIBLE);
			spi3.setVisibility(View.INVISIBLE);
			spi4.setVisibility(View.INVISIBLE);
			spi7.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit1.setVisibility(View.INVISIBLE);
			credit2.setVisibility(View.INVISIBLE);
			credit3.setVisibility(View.INVISIBLE);
			credit4.setVisibility(View.INVISIBLE);
			credit7.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 8:

			semester1.setVisibility(View.INVISIBLE);
			semester2.setVisibility(View.INVISIBLE);
			semester3.setVisibility(View.INVISIBLE);
			semester4.setVisibility(View.INVISIBLE);
			semester8.setVisibility(View.INVISIBLE);


			spi1.setVisibility(View.INVISIBLE);
			spi2.setVisibility(View.INVISIBLE);
			spi3.setVisibility(View.INVISIBLE);
			spi4.setVisibility(View.INVISIBLE);
			spi8.setVisibility(View.INVISIBLE);

			credit1.setVisibility(View.INVISIBLE);
			credit2.setVisibility(View.INVISIBLE);
			credit3.setVisibility(View.INVISIBLE);
			credit4.setVisibility(View.INVISIBLE);
			credit8.setVisibility(View.INVISIBLE);

			break;

		case 9:


			if(selected_course.equals("Diploma Engineering")||selected_course.equals("Diploma Pharmacy")||selected_course.equals("BCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester3.setVisibility(View.INVISIBLE);
				semester4.setVisibility(View.INVISIBLE);

				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi3.setVisibility(View.INVISIBLE);
				spi4.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit3.setVisibility(View.INVISIBLE);
				credit4.setVisibility(View.INVISIBLE);

			}	else if(selected_course.equals("MCA")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester7.setVisibility(View.INVISIBLE);
				semester8.setVisibility(View.INVISIBLE);

				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi7.setVisibility(View.INVISIBLE);
				spi8.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit7.setVisibility(View.INVISIBLE);
				credit8.setVisibility(View.INVISIBLE);

			}	else if(selected_course.equals("PDDC") || selected_course.equals("BE") || selected_course.equals("B.Pharm")){

				semester1.setVisibility(View.INVISIBLE);
				semester2.setVisibility(View.INVISIBLE);
				semester3.setVisibility(View.INVISIBLE);
				semester4.setVisibility(View.INVISIBLE);

				spi1.setVisibility(View.INVISIBLE);
				spi2.setVisibility(View.INVISIBLE);
				spi3.setVisibility(View.INVISIBLE);
				spi4.setVisibility(View.INVISIBLE);

				credit1.setVisibility(View.INVISIBLE);
				credit2.setVisibility(View.INVISIBLE);
				credit3.setVisibility(View.INVISIBLE);
				credit4.setVisibility(View.INVISIBLE);
			}	else if(selected_course.equals("ME")||selected_course.equals("M.Pharm")||selected_course.equals("MBA")){

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
			}

			break;

		default:
			break;
		}


	}
}