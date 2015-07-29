package com.example.assignmentexample88;

import android.app.ActionBar;
import android.app.ActionBar.OnNavigationListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SpinnerAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CustomSpinerAdapter adapter=new CustomSpinerAdapter(getApplicationContext());
		ActionBar ab=getActionBar();
		ab.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		ab.setListNavigationCallbacks(adapter, new OnNavigationListener() {
			String frm;
			@Override
			public boolean onNavigationItemSelected(int itemPosition, long itemId) {
				// TODO Auto-generated method stub
				
				if(itemPosition==0)
				{
					frm=Fragmnet1Activity.class.getName();
				}
				if(itemPosition==1)
				{
					frm=Fragmnet2Activity.class.getName();
				}
				FragmentTransaction ft=getFragmentManager().beginTransaction();
				Fragment fragment=Fragment.instantiate(MainActivity.this, frm);
				ft.add(android.R.id.content, fragment);
				ft.show(fragment);
				ft.commit();
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
}
