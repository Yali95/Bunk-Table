package com.example.test;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
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
        	
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
        	
            return true;
        }
        if (id == R.id.action_clear){
        	
        	SharedPreferences sharepref =getSharedPreferences("Periods", Context.MODE_APPEND);
    		SharedPreferences.Editor editor = sharepref.edit();
    		editor.clear().commit();
        }
        return super.onOptionsItemSelected(item);
    }

   public void tab(View v) {

	   Intent tab = new Intent(this, TableActivity.class);
	   startActivity(tab);

}
    
}
