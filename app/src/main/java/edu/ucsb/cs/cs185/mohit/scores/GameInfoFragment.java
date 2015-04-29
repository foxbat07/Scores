package edu.ucsb.cs.cs185.mohit.scores;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Filter;

import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/**
 * Created by mohithingorani on 4/27/15.
 */

public class GameInfoFragment extends DialogFragment {

    View v;
    EditText NameOfTeam1;
    EditText NameOfTeam2;
    EditText ScoreOfTeam1;
    EditText ScoreOfTeam2;

    public interface GameInfoListener {
        public void onDialogPositiveClick(DialogFragment dialog, String s1, String s2, String s3, String s4);

    }

    GameInfoListener gListener;

    public void onAttach(Activity activity) {
        super.onAttach(activity);
// Verify that the host activity implements the callback interface
        try {
// Instantiate the NoticeDialogListener so we can send events to the host
            gListener = (GameInfoListener) activity;
        } catch (ClassCastException e) {
// The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement NoticeDialogListener");
        }

    }

    ////try get listener work



    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
// Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
// Inflate the layout view
        v = inflater.inflate(R.layout.gameinfolayout, null);
// extract and modify any views of layout as necessary here using findViewById
// Set the layout for the dialog
        builder.setView(v);

        //--------------------------------------
        // Get a reference to the AutoCompleteTextView in the layout
        // getActivity().getLayoutInflater();

        AutoCompleteTextView textView = (AutoCompleteTextView) v.findViewById(R.id.autoCompleteTextView1); // Get the string array
        String[] teams = getResources().getStringArray(R.array.teams_array);
        // Create the adapter and set it to the AutoCompleteTextView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, teams);
        textView.setAdapter(adapter);
        AutoCompleteTextView textView2 = (AutoCompleteTextView) v.findViewById(R.id.autoCompleteTextView2); // Get the string array
        textView2.setAdapter(adapter);


        ////--------------------------------
        // Add action buttons
        builder.setPositiveButton(R.string.my_positive_string, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                // do something
                // save state here
                NameOfTeam1 = (EditText) v.findViewById(R.id.autoCompleteTextView1);
                String s1 = NameOfTeam1.getText().toString();

                NameOfTeam2 = (EditText) v.findViewById(R.id.autoCompleteTextView2);
                String s2 = NameOfTeam2.getText().toString();

                ScoreOfTeam1 = (EditText) v.findViewById(R.id.editText);
                String s3 = ScoreOfTeam1.getText().toString();

                ScoreOfTeam2 = (EditText) v.findViewById(R.id.editText2);
                String s4 = ScoreOfTeam2.getText().toString();


                gListener.onDialogPositiveClick(GameInfoFragment.this, s1, s2, s3, s4);

            }

        });

        return builder.create();

    }
}







