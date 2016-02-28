package edu.dtcc.emailman.listfragapp;

/*
 * Created by emailman on 2/28/16.
 */

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Fragment1Activity extends ListFragment {

    String[] countries =
            {
            "India",
            "Pakistan",
            "Sri Lanka",
            "China",
            "Bangladesh",
            "Nepal"
            };

    @Override
    public View onCreateView
            (LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        // Creating an array adapter to store the list of countries
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(inflater.getContext(),
                        android.R.layout.simple_list_item_1,countries);

        // Setting the list adapter for the ListFragment
        setListAdapter(adapter);

        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        TextView selectedOption = (TextView) getActivity().findViewById(R.id.selectedOption);
        selectedOption.setText("You selected " + ((TextView) v).getText().toString());
    }
}

