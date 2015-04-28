package edu.ucsb.cs.cs185.mohit.scores;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void showDatePickerDialog (View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show( getFragmentManager(), "datePicker");

    }


    public void showGameInfoDialog (View v) {

        DialogFragment newFragment = new GameInfoFragment();
        newFragment.show( getFragmentManager(), "gameInfoPicker");
    }


    public void clearAllInfoDialog (View v) {

        String date = "Date";
        TextView textViewToChange = (TextView) findViewById(R.id.currentDate);
        textViewToChange.setText(date);




    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
