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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of locations in the Sights category
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.park_abuja_central), getString(R.string.park_abuja_central_address), getString(R.string.open_everyday), getString(R.string.nine_am_to_nine_pm), R.drawable.park_central));
        locations.add(new Location(getString(R.string.park_circle_gardens), getString(R.string.park_circle_gardens_address), getString(R.string.mondays_to_saturdays), getString(R.string.seven_thirty_am_to_six_pm), R.drawable.park_circle_garden));
        locations.add(new Location(getString(R.string.park_city), getString(R.string.park_city_address), getString(R.string.open_everyday), getString(R.string.twenty_four_hours), R.drawable.park_city));
        locations.add(new Location(getString(R.string.park_durban_street), getString(R.string.park_durban_street_address), getString(R.string.open_everyday), getString(R.string.six_am_to_six_pm), R.drawable.park_durban_neighborhood));
        locations.add(new Location(getString(R.string.park_magicland), getString(R.string.park_magicland_address), getString(R.string.open_everyday), getString(R.string.nine_am_to_seven_pm), R.drawable.park_magicland));
        locations.add(new Location(getString(R.string.park_maitama), getString(R.string.park_maitama_address), getString(R.string.open_everyday), getString(R.string.six_am_to_six_pm), R.drawable.park_maitama_amusement));
        locations.add(new Location(getString(R.string.park_millennium), getString(R.string.park_millennium_address), getString(R.string.open_everyday), getString(R.string.six_am_to_six_pm), R.drawable.park_millenium));
        locations.add(new Location(getString(R.string.park_national_children), getString(R.string.park_national_children_address), getString(R.string.open_everyday), getString(R.string.six_am_to_six_pm), R.drawable.park_national_children));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}