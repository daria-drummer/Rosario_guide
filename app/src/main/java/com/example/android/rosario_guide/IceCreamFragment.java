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
public class IceCreamFragment extends Fragment {


    public IceCreamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Natelli helados naturales", "Sargento Cabral 523", R.drawable.natelli));
        places.add(new Place("Heladeria Esther", "Bulevar Orono y Jujuy", R.drawable.esther));
        places.add(new Place("Marbet Helados", "Avenida Carlos Pellegrini 1050", R.drawable.marbet));
        places.add(new Place("Yomo", "Avenida Pelegrini | Esquina Juan Manuel De Rosas\n", R.drawable.yomo));
        places.add(new Place("De Buen Humor", "Calle Rioja 1560", R.drawable.buen_humor));
        places.add(new Place("Heladería Freeshop", "Calle Gral San Martin 1203 | esquina Mendoza", R.drawable.freeshop));
        places.add(new Place("Heladería Kiwi", "Juan José Paso 7702", R.drawable.kiwi));
        places.add(new Place("Gianduia", "Avenida Salta 2412", R.drawable.gianduia));

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
