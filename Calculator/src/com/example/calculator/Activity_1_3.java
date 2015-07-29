package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Activity_1_3 extends Activity {

	TextView blog,fb,twitter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_1_3);
		
		blog=(TextView)findViewById(R.id.blog);
		fb=(TextView)findViewById(R.id.facebook);
		twitter=(TextView)findViewById(R.id.twitter);
		
		blog.setMovementMethod(LinkMovementMethod.getInstance());
		fb.setMovementMethod(LinkMovementMethod.getInstance());
		twitter.setMovementMethod(LinkMovementMethod.getInstance());
		
	}

	
}
