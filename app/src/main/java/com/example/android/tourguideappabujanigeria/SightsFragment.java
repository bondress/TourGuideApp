package com.example.android.tourguideappabujanigeria;


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
public class SightsFragment extends Fragment {


    public SightsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of locations in the Sights category
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.sight_aso_rock), getString(R.string.sight_aso_rock_desc1), getString(R.string.sight_aso_rock_desc2), getString(R.string.sight_aso_rock_desc3), R.drawable.sight_aso_rock));
        locations.add(new Location(getString(R.string.sight_zuma_rock), getString(R.string.sight_zuma_rock_desc1), getString(R.string.sight_zuma_rock_desc2), getString(R.string.sight_zuma_rock_desc3), R.drawable.sight_zuma_rock));
        locations.add(new Location(getString(R.string.sight_national_mosque), getString(R.string.sight_national_mosque_desc1), getString(R.string.sight_national_mosque_desc2), getString(R.string.sight_national_mosque_desc3), R.drawable.sight_abuja_national_mosque));
        locations.add(new Location(getString(R.string.sight_national_church), getString(R.string.sight_national_church_desc1), getString(R.string.sight_national_church_desc2), getString(R.string.sight_national_church_desc3), R.drawable.sight_national_church));
        locations.add(new Location(getString(R.string.sight_yaradua_centre), getString(R.string.sight_yaradua_centre_desc1), getString(R.string.sight_yaradua_centre_desc2), getString(R.string.sight_yaradua_centre_desc3), R.drawable.sight_yaradua_centre));
        locations.add(new Location(getString(R.string.sight_eagle_square), getString(R.string.sight_eagle_square_desc1), getString(R.string.sight_eagle_square_desc2), getString(R.string.sight_eagle_square_desc3), R.drawable.sight_eagle_square));
        locations.add(new Location(getString(R.string.sight_national_arboretum), getString(R.string.sight_national_arboretum_desc1), getString(R.string.sight_national_arboretum_desc2), getString(R.string.sight_national_arboretum_desc3), R.drawable.sight_national_arboretum));
        locations.add(new Location(getString(R.string.sight_arts_village), getString(R.string.sight_arts_village_desc1), getString(R.string.sight_arts_village_desc2), getString(R.string.sight_arts_village_desc3), R.drawable.sight_arts_village));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}