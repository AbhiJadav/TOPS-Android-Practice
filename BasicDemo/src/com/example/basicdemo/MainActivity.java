package com.example.basicdemo;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		System.out.println("On Start Call");
		super.onStart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		System.out.println("On Resume Call");
		super.onResume();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		System.out.println("on Restart Call");
		super.onRestart();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		System.out.println("on Pause Call");
		Intent t=new Intent(MainActivity.this,TransferActivity.class);
		startActivity(t);
		super.onPause();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		System.out.println("on Stop call");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		System.out.println("On destory Call");
		super.onDestroy();
	}
}
