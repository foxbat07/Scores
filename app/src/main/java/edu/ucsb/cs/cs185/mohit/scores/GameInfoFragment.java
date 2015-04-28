package edu.ucsb.cs.cs185.mohit.scores;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Filter;

import android.widget.AutoCompleteTextView;

/**
 * Created by mohithingorani on 4/27/15.
 */

public class GameInfoFragment extends DialogFragment {


    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
// Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();
// Inflate the layout view
        View v = inflater.inflate(R.layout.gameinfolayout, null);
// extract and modify any views of layout as necessary here using findViewById
// Set the layout for the dialog
        builder.setView(v);
// Add action buttons
        builder.setPositiveButton(R.string.my_positive_string, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
// do something



/*
// Get a reference to the AutoCompleteTextView in the layout
AutoCompleteTextView textView = (AutoCompleteTextView) getActivity().findViewById(R.id.autoCompleteTextView);
AutoCompleteTextView textView2 = (AutoCompleteTextView) getActivity().findViewById(R.id.autoCompleteTextView2);
// Get the string array
String[] teams = getResources().getStringArray(R.array.autocomplete_team);
// Create the adapter and set it to the AutoCompleteTextView
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,teams);

textView.setAdapter(adapter);
textView2.setAdapter(adapter);

*/


                    }
                });

        return builder.create();

    }
}







