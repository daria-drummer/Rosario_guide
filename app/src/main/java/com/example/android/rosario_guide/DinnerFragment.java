package com.example.android.miwok;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class DinnerFragment extends Fragment {

    public DinnerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<com.example.android.miwok.Place> places = new ArrayList<com.example.android.miwok.Place>();
        places.add(new com.example.android.miwok.Place("Los Jardines", "España y el Río", R.drawable.acorn);
        places.add(new com.example.android.miwok.Place("Los Jardines", "España y el Río", R.drawable.acorn);
        places.add(new com.example.android.miwok.Place("Los Jardines", "España y el Río", R.drawable.acorn);
        places.add(new com.example.android.miwok.Place("Los Jardines", "España y el Río", R.drawable.acorn);
        places.add(new com.example.android.miwok.Place("Los Jardines", "España y el Río", R.drawable.acorn);


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.android.miwok.PlaceAdapter adapter = new com.example.android.miwok.PlaceAdapter(getActivity(), places, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
