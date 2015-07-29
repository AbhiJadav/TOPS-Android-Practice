package com.example.assignmentexample79;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapater extends BaseAdapter {

	List<User>list;
	Context context;
	public MyAdapater(List<User> list, Context context) {
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
		convertView=inflater.inflate(R.layout.customlist,null);
		User user1=list.get(position);
		TextView txtid=(TextView)convertView.findViewById(R.id.showid);
		TextView txtname=(TextView)convertView.findViewById(R.id.showname);
		TextView txtemail=(TextView)convertView.findViewById(R.id.showemail);
		TextView txtphone=(TextView)convertView.findViewById(R.id.showphone);
		TextView txtadd=(TextView)convertView.findViewById(R.id.showadd);
		
		txtid.setText(user1.getId()+"");
		txtname.setText(user1.getName());
		txtemail.setText(user1.getEmail());
		txtphone.setText(user1.getPhone());
		txtadd.setText(user1.getAdd());
		
	return convertView;
	}

}
