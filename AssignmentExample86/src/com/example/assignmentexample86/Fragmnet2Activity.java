package com.example.assignmentexample86;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmnet2Activity extends Fragment {
	TextView tx;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View V1=inflater.inflate(R.layout.activity_fragmnet2,null);
	tx=(TextView)V1.findViewById(R.id.txtshow);
	
	return V1;
	}
void set(String s)
{
	tx.setText(s);
}
	
}
