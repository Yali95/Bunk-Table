package com.example.test;

import java.util.Calendar;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class TableActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table);
	    
		
    SharedPreferences test = getSharedPreferences("Periods", Context.MODE_PRIVATE);
        
    Calendar cal = Calendar.getInstance();
	int day = cal.get(Calendar.DAY_OF_WEEK);
	

	
	TextView tv = (TextView) findViewById(R.id.tabletext);
	
	Button perbut1 = (Button) findViewById(R.id.tabper1);
	Button perbut2 = (Button) findViewById(R.id.tabper2);
	Button perbut3 = (Button) findViewById(R.id.tabper3);
	Button perbut4 = (Button) findViewById(R.id.tabper4);
	Button perbut5 = (Button) findViewById(R.id.tabper5);
	Button perbut6 = (Button) findViewById(R.id.tabper6);
	Button perbut7 = (Button) findViewById(R.id.tabper7);
	
	switch(day)
	{
	case 1:
		Toast.makeText(this, "Sunday", Toast.LENGTH_SHORT).show();
		tv.setText("Sunday");
		
		perbut1.setText("Holiday......");
	
		perbut2.setText("Holiday......");
		
		perbut3.setText("Holiday......");
		
		perbut4.setText("Holiday......");
		
		perbut5.setText("Holiday......");
		
		perbut6.setText("Holiday......");
		
		perbut7.setText("Holiday......");
		
		break;
	case 2:
		Toast.makeText(this, "Monday", Toast.LENGTH_SHORT).show();
		tv.setText("Monday");
		
		perbut1.setText(test.getString("monper1", "Not Set"));
		
		perbut2.setText(test.getString("monper2", "Not Set"));
		
		perbut3.setText(test.getString("monper3", "Not Set"));
		
		perbut4.setText(test.getString("monper4", "Not Set"));
		
		perbut5.setText(test.getString("monper5", "Not Set"));
		
		perbut6.setText(test.getString("monper6", "Not Set"));
		
		perbut7.setText(test.getString("monper7", "Not Set"));
		
		break;
	case 3:
		Toast.makeText(this, "Tuesday", Toast.LENGTH_SHORT).show();
		tv.setText("Tuesday");
		
		perbut1.setText(test.getString("tuesper1", "Not Set"));
		
		perbut2.setText(test.getString("tuesper2", "Not Set"));
		
		perbut3.setText(test.getString("tuesper3", "Not Set"));
		
		perbut4.setText(test.getString("tuesper4", "Not Set"));
		
		perbut5.setText(test.getString("tuesper5", "Not Set"));
		
		perbut6.setText(test.getString("tuesper6", "Not Set"));
		
		perbut7.setText(test.getString("tuesper7", "Not Set"));
		
		break;
	case 4:
		Toast.makeText(this, "Wednesday", Toast.LENGTH_SHORT).show();
		tv.setText("Wednesday");
		
		perbut1.setText(test.getString("wednesper1", "Not Set"));
		
		perbut2.setText(test.getString("wednesper2", "Not Set"));
		
		perbut3.setText(test.getString("wednesper3", "Not Set"));
		
		perbut4.setText(test.getString("wednesper4", "Not Set"));
		
		perbut5.setText(test.getString("wednesper5", "Not Set"));
		
		perbut6.setText(test.getString("wednesper6", "Not Set"));
		
		perbut7.setText(test.getString("wednesper7", "Not Set"));
		
		break;
	case 5:
		Toast.makeText(this, "Thursday", Toast.LENGTH_SHORT).show();
		tv.setText("Thursday");
		
		perbut1.setText(test.getString("thursper1", "Not Set"));
		
		perbut2.setText(test.getString("thursper2", "Not Set"));
		
		perbut3.setText(test.getString("thursper3", "Not Set"));
		
		perbut4.setText(test.getString("thursper4", "Not Set"));
		
		perbut5.setText(test.getString("thursper5", "Not Set"));
		
		perbut6.setText(test.getString("thursper6", "Not Set"));
		
		perbut7.setText(test.getString("thursper7", "Not Set"));
		break;
	case 6:
		Toast.makeText(this, "Friday", Toast.LENGTH_SHORT).show();
		tv.setText("Friday");
		
		perbut1.setText(test.getString("friper1", "Not Set"));
		
		perbut2.setText(test.getString("friper2", "Not Set"));
		
		perbut3.setText(test.getString("friper3", "Not Set"));
		
		perbut4.setText(test.getString("friper4", "Not Set"));
		
		perbut5.setText(test.getString("friper5", "Not Set"));
		
		perbut6.setText(test.getString("friper6", "Not Set"));
		
		perbut7.setText(test.getString("friper7", "Not Set"));
		
		break;
	case 7:
		Toast.makeText(this, "Saturday", Toast.LENGTH_SHORT).show();
		tv.setText("Saturday");
		
		perbut1.setText(test.getString("saturper1", "Not Set"));

		perbut2.setText(test.getString("saturper2", "Not Set"));
		
		perbut3.setText(test.getString("saturper3", "Not Set"));
		
		perbut4.setText(test.getString("saturper4", "Not Set"));
		
		perbut5.setText(test.getString("saturper5", "Not Set"));
		
		perbut6.setText(test.getString("saturper6", "Not Set"));
		
		perbut7.setText(test.getString("saturper7", "Not Set"));
		
		break;
	}
	}

	
	
	}
