package com.example.fragmnetexample;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment2Activity extends Fragment {
List<String>list=new ArrayList<String>();
	ListView lv;
	@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	View v=inflater.inflate(R.layout.activity_fragment2, null);
	// TODO Auto-generated method stub
	lv=(ListView)v.findViewById(R.id.listView1);
	Fragmnet1Activity frm1=(Fragmnet1Activity)getFragmentManager().findFragmentById(R.id.fragment1);
	
	
	return v;
}
void insert(String s)
{
	list.add(s);
	lv.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list));
	
	
}
	
}
