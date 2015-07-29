package com.example.assigmentexample69;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Chronometer;
import android.widget.Chronometer.OnChronometerTickListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			/*
			Handler h=new Handler();
			h.postDelayed(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
				}
			}, 1000);*/
	/*int i=0;
	
		
		CountDownTimer down=new CountDownTimer(0,5000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onFinish() {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_LONG).show();
			}
		};
	*/
		/*Toast.makeText(MainActivity.this, "Toast1", Toast.LENGTH_SHORT).show();
		int i=100;
		Thread th=new Thread();
		
		while(i>=0)
		{
			
			
		try {
			th.sleep(2000);
			Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i--;
		}
	}*/
		 
		Chronometer ch=(Chronometer)findViewById(R.id.chronometer1);
		ch.setVisibility(View.INVISIBLE);
		ch.start();
		ch.setOnChronometerTickListener(new OnChronometerTickListener() {
			int interval=0;
			@Override
			public void onChronometerTick(Chronometer chronometer) {
				// TODO Auto-generated method stub
				interval++;
				if(interval==10)
				{
					Toast.makeText(MainActivity.this, "Toast", Toast.LENGTH_SHORT).show();
					interval=0;
					/*Intent t=new Intent(MainActivity.this,TransferActivity.class);
					startActivity(t);*/
				}
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
