package edu.ucsb.cs.cs185.mohit.scores;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends Activity implements GameInfoFragment.GameInfoListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onDialogPositiveClick(DialogFragment dialog, String s1, String s2, String s3, String s4) {
        // User touched the dialog's positive button


        TextView textViewTeamOne = (TextView) findViewById(R.id.textViewTeam1);
        //String TT1 = dialog.getText(R.id.autoCompleteTextView1).toString();

        textViewTeamOne.setText(s1);

        TextView textViewTeamTwo = (TextView) findViewById(R.id.textViewTeam2);
        textViewTeamTwo.setText(s2);

        TextView textViewScoreOne = (TextView) findViewById(R.id.teamOneScore);
        textViewScoreOne.setText(s3);

        TextView textViewScoreTwo = (TextView) findViewById(R.id.teamTwoScore);
        textViewScoreTwo.setText(s4);


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

        TextView textViewTeamOne = (TextView) findViewById(R.id.textViewTeam1);
        textViewTeamOne.setText("Team 1");

        TextView textViewTeamTwo = (TextView) findViewById(R.id.textViewTeam2);
        textViewTeamTwo.setText("Team 2");

        TextView textViewScoreOne = (TextView) findViewById(R.id.teamOneScore);
        textViewScoreOne.setText("0");

        TextView textViewScoreTwo = (TextView) findViewById(R.id.teamTwoScore);
        textViewScoreTwo.setText("0");




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
