package cn.edu.gdmec.s07131040.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {
	TextView myTv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		Intent myintent = getIntent();
		Bundle mybundle = myintent.getExtras();
		String mystr = mybundle.getString("para1");
		myTv = (TextView) findViewById(R.id.textView1);
		myTv.setText(mystr);

	}

}
