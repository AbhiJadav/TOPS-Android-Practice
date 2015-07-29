package com.example.assignmentexample82;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{

	Context context;
	List<User>list;
	public MyAdapter(Context context, List<User> list) {
		super();
		this.context = context;
		this.list = list;
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
		convertView=inflater.inflate(R.layout.customlist,null);
		User user=list.get(position);
		TextView tx1=(TextView)convertView.findViewById(R.id.txtid);
		TextView tx2=(TextView)convertView.findViewById(R.id.txtname);
		TextView tx3=(TextView)convertView.findViewById(R.id.txtemail);
		
		tx1.setText(user.getId()+"");
		tx2.setText(user.getName());
		tx3.setText(user.getEmail());
		
		return convertView;
	}

}
