package edu.ucsb.cs.cs185.mohit.scores;

/**
 * Created by mohithingorani on 4/25/15.
 */

import android.app.DialogFragment;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.widget.DatePicker;
import android.widget.TextView;
import java.text.DateFormat;
import java.util.Date;




public class DatePickerFragment extends DialogFragment
        implements DatePickerDialog.OnDateSetListener {





    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        final Calendar c = Calendar.getInstance();
        //Date to be set  Apr. 17, 2013
        c.set(2013,3,17);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }

    public void onDateSet(DatePicker view, int year, int month, int day) {




        Calendar nc = Calendar.getInstance();
        nc.set(year,month,day);
        //String DateString = nc.get

        //SimpleDateFormat sdf = new SimpleDateFormat("MM dd, yyyy");
        //String DateString = sdf.format(nc);
        //SimpleDateFormat df = new SimpleDateFormat("MMM-dd-yyyy");
        SimpleDateFormat df = new SimpleDateFormat("MMMM dd,yyyy");

        String DateString = df.format(nc.getTime());

        TextView textViewToChange = (TextView) getActivity().findViewById(R.id.currentDate);
        textViewToChange.setText(DateString);



    }
}