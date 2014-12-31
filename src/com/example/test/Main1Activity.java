package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main1Activity extends ActionBarActivity {
	static final String STATE_SCORE = "playerScore";
	public static final String TAG = "Main1Activity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView text1 = (TextView) findViewById(R.id.textView1);
		Log.i(TAG, "GGGGGGGGGGGGGGGGGGGGGGGGGGG");
		Button button = (Button) findViewById(R.id.button1);

		// g.i(TAG, "111111111111111111111"
		// +savedInstanceState.getString(STATE_SCORE) + "22222");
		if (savedInstanceState != null) {
			text1.setText(savedInstanceState.getString(STATE_SCORE));
			Log.i(TAG,
					"111111111111111111111"
							+ savedInstanceState.getString(STATE_SCORE)
							+ "22222");
		}
		setContentView(R.layout.activity_main1);
	}

	
	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		TextView text1 = (TextView) findViewById(R.id.textView1);
		Log.i(TAG, "AAAAAAAAAAAAAAAAAAAAA");
		text1.setText(savedInstanceState.getString(STATE_SCORE));
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stubSta
		EditText text1 = (EditText) findViewById(R.id.editText1);
		Log.i(TAG, "BBBBBBBBBBBBBBBB");
		outState.putString(STATE_SCORE, text1.getText().toString());
		super.onSaveInstanceState(outState);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main1, menu);
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
