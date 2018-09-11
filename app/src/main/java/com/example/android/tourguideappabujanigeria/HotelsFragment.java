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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create an array of locations in the Sights category
        ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.hotel_sheraton), getString(R.string.hotel_sheraton_address), getString(R.string.hotel_sheraton_rate), R.drawable.hotel_sheraton));
        locations.add(new Location(getString(R.string.hotel_nicon), getString(R.string.hotel_nicon_address), getString(R.string.hotel_nicon_rate), R.drawable.hotel_nicon_luxury));
        locations.add(new Location(getString(R.string.hotel_transcorp), getString(R.string.hotel_transcorp_address), getString(R.string.hotel_transcorp_rate), R.drawable.hotel_transcorp_hilton));
        locations.add(new Location(getString(R.string.hotel_grand), getString(R.string.hotel_grand_address), getString(R.string.hotel_grand_rate), R.drawable.hotel_grand_ibro));
        locations.add(new Location(getString(R.string.hotel_bolton), getString(R.string.hotel_bolton_address), getString(R.string.hotel_bolton_rate), R.drawable.hotel_bolton));
        locations.add(new Location(getString(R.string.hotel_fraser), getString(R.string.hotel_fraser_address), getString(R.string.hotel_fraser_rate), R.drawable.hotel_fraser_suites));
        locations.add(new Location(getString(R.string.hotel_rockview), getString(R.string.hotel_rockview_address), getString(R.string.hotel_rockview_rate), R.drawable.hotel_rockview_classic));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}