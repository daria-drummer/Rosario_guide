package com.example.android.rosario_guide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinksMusicFragment extends Fragment {


    public DrinksMusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Beatmemo", "Bvd. Oroño 107", R.drawable.beatmemo));
        places.add(new Place("Rock & Feller's", "Boulevard Nicasio Orono 106", R.drawable.rock_and_fellers));
        places.add(new Place("Johnny B Good", "Guemes 2197", R.drawable.johny));
        places.add(new Place("Antares Rosario", "Avenida Carlos Pellegrini 1149", R.drawable.antares));
        places.add(new Place("Chinchibira", "Santiago 101", R.drawable.chinchibira));
        places.add(new Place("O'Connell's", "Calle Jujuy 2243", R.drawable.oconnels));
        places.add(new Place("The Black Sheep", "Calle Italia 102", R.drawable.black_sheep));
        places.add(new Place("Basquiat Street Pub", "Calle Alte G Brown 2265", R.drawable.street_pub));
        places.add(new Place("Manush", "Güemes 2330", R.drawable.manush));

        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.all_categories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}

