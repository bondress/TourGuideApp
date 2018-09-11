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
public class MarketsFragment extends Fragment {


    public MarketsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of locations in the Sights category
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.market_wuse), getString(R.string.market_wuse_address), getString(R.string.mondays_to_saturdays), getString(R.string.eight_am_to_six_pm), R.drawable.market_wuse));
        locations.add(new Location(getString(R.string.market_fruit), getString(R.string.market_fruit_address), getString(R.string.open_everyday), getString(R.string.eight_am_to_nine_pm), R.drawable.market_fruit));
        locations.add(new Location(getString(R.string.market_garki), getString(R.string.market_garki_address), getString(R.string.open_everyday), getString(R.string.seven_am_to_six_pm), R.drawable.market_garki_international));
        locations.add(new Location(getString(R.string.market_fish), getString(R.string.market_fish_address), getString(R.string.mondays_to_saturdays), getString(R.string.eight_am_to_six_pm), R.drawable.market_fish));
        locations.add(new Location(getString(R.string.market_dutse), getString(R.string.market_dutse_address), getString(R.string.open_everyday), getString(R.string.six_am_to_ten_pm), R.drawable.market_dutse));
        locations.add(new Location(getString(R.string.market_maitama_farmers), getString(R.string.market_maitama_farmers_address), getString(R.string.open_everyday), getString(R.string.seven_am_to_ten_pm), R.drawable.market_maitama_farmers));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}