package com.example.assignmentexample88;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class TabClick implements TabListener {

	MainActivity activity;
	String name;
	public TabClick(MainActivity activity, String name) {
		super();
		this.activity = activity;
		this.name = name;
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		Fragment fragment=Fragment.instantiate(activity, name);
		ft.replace(android.R.id.content, fragment);
		ft.show(fragment);
		
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

}
