package com.example.android.archimemedesprinciple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.android.archimemedesprinciple.R;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void myClickHandler(View view) {
        Intent i = new Intent(this, com.example.android.archimemedesprinciple.Videos.class);
        i.putExtra("key", (int) 1);
        String TAG="TEST ";
        Log.e(TAG,"Clicked");
        startActivity(i);

    }

    public void myClickHandler2(View view) {
        Intent i=new Intent(this, com.example.android.archimemedesprinciple.Videos.class);
        i.putExtra("key", (int) 2);
        startActivity(i);
    }

    public void myClickHandler3(View view) {
        Intent i=new Intent(this, com.example.android.archimemedesprinciple.Calculator.class);
        startActivity(i);

    }

    public void myClickHandler4(View view) {
        finish();
    }

    public void runCredits(View view) {
        Intent i=new Intent(this, com.example.android.archimemedesprinciple.CreditsActivity.class);
        startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
