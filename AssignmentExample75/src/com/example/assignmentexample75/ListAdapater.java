package com.example.assignmentexample75;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapater extends BaseAdapter {
	String[] txtdesc={"Menu1","Menu2","Menu3","Menu4","Menu5"};
	int []images={R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher,R.drawable.ic_launcher};
	Context context;
	ArrayList<DataClass>list;
	
	public ListAdapater(Context c) {
		super();
		context=c;
		list=new ArrayList<DataClass>();
		for(int i=0;i<txtdesc.length;i++)
		{
			list.add(new DataClass(images[i], txtdesc[i]));
		}
		// TODO Auto-generated constructor stub
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
		View row=convertView;
					LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row=inflater.inflate(R.layout.listcustom, null);
		ImageView	im=(ImageView)row.findViewById(R.id.imageView1);
		TextView	tx=(TextView)row.findViewById(R.id.textView1);
		
		return row;
	
	}
}
