package com.example.assignmentexample88;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomSpinerAdapter extends BaseAdapter {

	List<String>list=new ArrayList<String>();
	//List<Data>list;
	//String[] txttitle={"Menu1","Menu2","Menu3","Menu4","Menu5"};
	String[] txtdesc={"Fragment1","Fragment2"};
	//int []images={R.drawable.ic_launcher,R.drawable.ic_launcher};
	Context context;
	public CustomSpinerAdapter(Context context) {
		super();
		//list=new ArrayList<Data>();
		for(int i=0;i<txtdesc.length;i++)
		{
			list.add(txtdesc[i]);
		}
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
		View row=inflater.inflate(R.layout.customspiner, null);
		//ImageView im=(ImageView)row.findViewById(R.id.imageView1);
		TextView tx=(TextView)row.findViewById(R.id.textView1);
		Data data=new Data();
		//im.setImageResource(data.getImages());
		tx.setText(data.getFragmnetname());
		
		
		return row;
	}

}
