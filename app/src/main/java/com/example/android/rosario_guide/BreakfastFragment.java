package com.example.android.rosario_guide;

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
public class BreakfastFragment extends Fragment {

    public BreakfastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of words
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Confiteria Nuria", "Calle Balcarce 1201", R.drawable.nuria));
        places.add(new Place("Savoy Grand Cafe", "Calle San Lorenzo 1006", R.drawable.savoy));
        places.add(new Place("Sablé Paris", "Calle San Lorenzo 1146", R.drawable.paris));
        places.add(new Place("Georgia Coffee & Bar", "Calle Santa Fe 2018", R.drawable.georgia));
        places.add(new Place("Crepas Rosario", "Oroño 29", R.drawable.crepas));
        places.add(new Place("Balcarce Café", "Jujuy 1498", R.drawable.balcarce));
        places.add(new Place("Café Charlotte", "Avenida Eva Peron 7974", R.drawable.charlotte));
        places.add(new Place("Café Nolita", "Calle Paraguay 560", R.drawable.nolita));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.category_breakfast);

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
