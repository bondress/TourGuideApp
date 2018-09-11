package com.example.android.tourguideappabujanigeria;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new LocationAdapter object
     *
     * @param context   is the current activity that the adapter is being created.
     * @param locations the list of Location objects to be displayed.
     */
    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here the ArrayAdapter's internal storage for the context and the list is initialised
        // the second argument is used when the ArrayAdapter is populating a TextView
        // Because this is a custom adapter for Four TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, 0 is used.
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Word object located at this position in the list
        Location currentLocation = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID titleText
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.titleText);
        // Get the Title from the current Location object and
        // set this text on the titleText TextView
        titleTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the list_item.xml layout with the ID secondaryTextOne
        TextView secondTextView = (TextView) listItemView.findViewById(R.id.secondaryTextOne);
        // Get the second Location object from the current Location object and
        // set this text on this TextView
        secondTextView.setText(currentLocation.getLocationStringTwo());

        // Find the TextView in the list_item.xml layout with the ID secondaryTextTwo
        TextView thirdTextView = (TextView) listItemView.findViewById(R.id.secondaryTextTwo);
        // Get the third Location object from the current Location object and
        // set this text on this TextView
        thirdTextView.setText(currentLocation.getLocationStringThree());

        // Find the TextView in the list_item.xml layout with the ID secondaryTextThree
        TextView fourthTextView = (TextView) listItemView.findViewById(R.id.secondaryTextThree);
        // Get the fourth Location object from the current Location object and
        // set this text on this TextView
        if (currentLocation.noFourthText()) {
            // Hide the TextView (set visibility to GONE)
            fourthTextView.setVisibility(View.GONE);
        } else {
            // If text is available, display the text provided
            fourthTextView.setText(currentLocation.getLocationStringFour());
        }

        // Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Display the image based on the resource ID
        imageView.setImageResource(currentLocation.getImageResourceId());

        // Return the whole list item layout (containing 4 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}