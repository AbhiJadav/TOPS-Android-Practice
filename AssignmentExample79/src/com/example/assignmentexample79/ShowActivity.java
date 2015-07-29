package com.example.assignmentexample79;

import java.util.List;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;

public class ShowActivity extends ActionBarActivity {

	ListView lv;
	List<User>list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show);
		lv=(ListView)findViewById(R.id.listView1);
		DbHandler db=new DbHandler(ShowActivity.this);
		list=db.show();
		MyAdapater adapater=new MyAdapater(list, ShowActivity.this);
		lv.setAdapter(adapater);
		registerForContextMenu(lv);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.show, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
		menu.add(0, 0, 0, "Update");
		menu.add(0, 1, 1, "Delete");
		
		super.onCreateContextMenu(menu, v, menuInfo);
	}
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		int i=item.getItemId();
		AdapterContextMenuInfo acmi=(AdapterContextMenuInfo)item.getMenuInfo();
		int postion=acmi.position;
		User user1=list.get(postion);
		if(i==0)
		{
			Intent t=new Intent(ShowActivity.this,UpdateActivity.class);
			t.putExtra("id",user1.getId());
			t.putExtra("name", user1.getName());
			t.putExtra("email", user1.getEmail());
			t.putExtra("phone", user1.getPhone());
			t.putExtra("add", user1.getAdd());
			startActivity(t);
		}
		if(i==1)
		{
			DbHandler db=new DbHandler(ShowActivity.this);
			db.delete(user1);
			refresh();
		}
		return super.onContextItemSelected(item);
	}
	void refresh()
	{
		DbHandler db=new DbHandler(ShowActivity.this);
		list=db.show();
		MyAdapater adpater=new MyAdapater(list, ShowActivity.this);
		lv.setAdapter(adpater);
		
		
	}
}
