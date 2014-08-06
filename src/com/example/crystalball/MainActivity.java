package com.example.crystalball;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

	private CrystalBall mCrystalBall = new CrystalBall();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Declare our View variables and assign them the Views from the layout file
		final TextView answerLabel = (TextView) findViewById(R.id.textView1);
		Button getAnswerButton = (Button) findViewById(R.id.button1);
		
		// EXTRA CREDIT: Change background color on click
		//final RelativeLayout layout = (RelativeLayout) findViewById(R.id.relativeLayout1);
		
		getAnswerButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				String answer = mCrystalBall.getAnAnswer();

				// Update the label with our dynamic answer
				answerLabel.setText(answer);
				
				// EC1:
				//layout.setBackgroundColor(Color.GREEN);
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
