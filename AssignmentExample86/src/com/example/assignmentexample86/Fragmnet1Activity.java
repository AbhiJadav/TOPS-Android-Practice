package com.example.assignmentexample86;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragmnet1Activity extends Fragment {

	Button btn;
	EditText ed;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View V=inflater.inflate(R.layout.activity_fragmnet1, null);
		btn=(Button)V.findViewById(R.id.button1);
		ed=(EditText)V.findViewById(R.id.editText1);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Fragmnet2Activity frm2=(Fragmnet2Activity)getFragmentManager().findFragmentById(R.id.fragment2);
				frm2.set(ed.getText().toString());
			}
		});
		return V;
	}

	
}
