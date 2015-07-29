package com.example.databaseexample1;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	List<User> list;
	Context context;
	
	public MyAdapter(List<User> list, Context context) {
		super();
		this.list = list;
		this.context = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		User user=list.get(position);
		
		convertView=inflater.inflate(R.layout.customlist, null);
		TextView tx=(TextView)convertView.findViewById(R.id.textView1);
		TextView tx1=(TextView)convertView.findViewById(R.id.textView2);
		tx.setText(user.getName());
		tx1.setText(user.getPass());
		return convertView;
	}

}
