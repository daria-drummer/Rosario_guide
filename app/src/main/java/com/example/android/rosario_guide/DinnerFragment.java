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

import com.example.android.rosario_guide.Place;
import com.example.android.rosario_guide.PlaceAdapter;

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
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Los Jardines", "España y el Río", R.drawable.jardines));
        places.add(new Place("Puerto Gaboto New", "Avenida Pellegrini 584", R.drawable.puerto));
        places.add(new Place("Chicharra Asador a Las Brasas", "Pueyrredon 1", R.drawable.chicharra));
        places.add(new Place("Bajada España", "Calle Espana y Barrancas del Río Parana", R.drawable.bajada));
        places.add(new Place("Ceviche Rosario", "Jujuy 2378", R.drawable.ceviche));
        places.add(new Place("Le Gulá", "Bv. Oroño y Av. Circunvalación", R.drawable.gula));
        places.add(new Place("La cantina de Bruno", "Ovidio Lagos y Montevideo", R.drawable.bruno));
        places.add(new Place("Viejo Balcon", "Avenida Guillermo Wheelwright 1815", R.drawable.balcon));
        places.add(new Place("Aceto & Oliva", "Calle Gral Guemes 2238", R.drawable.oliva));
        places.add(new Place("Refineria Parrilla Restaurant", "Rawson 443 Bis", R.drawable.parilla));


        // Create an {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places, R.color.all_categories);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // places_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
