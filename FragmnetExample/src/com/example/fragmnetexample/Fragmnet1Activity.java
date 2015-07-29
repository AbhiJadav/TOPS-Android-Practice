package com.example.fragmnetexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Fragmnet1Activity extends Fragment {

	Button b;
	EditText ed;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=inflater.inflate(R.layout.activity_fragmnet1, null);
		// TODO Auto-generated method stub
		b=(Button)v.findViewById(R.id.button1);
		ed=(EditText)v.findViewById(R.id.editText1);
		
		b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Fragment2Activity frm2=(Fragment2Activity)getFragmentManager().findFragmentById(R.id.fragment2);
				String s=ed.getText().toString();
				frm2.insert(s);
				ed.setText("");
				Toast.makeText(getActivity(), "Insert", Toast.LENGTH_SHORT).show();
				
			}
		});
		return v;
	}
}
