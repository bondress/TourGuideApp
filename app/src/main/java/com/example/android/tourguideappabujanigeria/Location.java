package com.example.android.tourguideappabujanigeria;

import android.support.annotation.Nullable;

/**
 * Contains the Location objects and methods
 */
public class Location {

    /**
     * Location Name
     */
    private String locationName;

    /**
     * Second String object
     * Could be:
     * Description (for Sights); or
     * Address (for Markets, Parks and Hotels)
     */
    private String locationStringTwo;

    /**
     * Third String object
     * Could be:
     * Opening Days(for Markets and Parks); or
     * Average rates (for Hotels)
     */
    private String locationStringThree;

    /** Constant value that represents no text was provided for this Location
     * This was created for the Hotels Location
     */
    private static final String NO_FOURTH_TEXT_PROVIDED = "";

    /**
     * Fourth String object
     * Opening Hours(for Markets and Parks)
     */
    private String locationStringFour = NO_FOURTH_TEXT_PROVIDED;

    /**
     * Corresponding Image Resource ID for the location
     */
    private int imageResourceId;

    /**
     * Create a new Location Object
     * @param name is the Location Name
     * @param stringTwo is the Address (for Markets and Parks) or Line 1 Description for Sights
     * @param stringThree is the Opening Days(for Markets and Parks) or Line 2 Description for Sights
     * @param stringFour is the Opening Hours(for Markets and Parks) or Line 3 Description for Sights
     * @param imageId is the Corresponding Image Resource ID for the location
     */
    public Location(String name, String stringTwo, String stringThree, String stringFour, int imageId){
        locationName = name;
        locationStringTwo = stringTwo;
        locationStringThree = stringThree;
        locationStringFour = stringFour;
        imageResourceId = imageId;
    }

    /**
     * Create a new Location Object
     * @param name is the Location Name
     * @param stringTwo is the Address (for Hotels)
     * @param stringThree is the Average rates (for Hotels)
     * @param imageId is the Corresponding Image Resource ID for the location
     */
    public Location(String name, String stringTwo, String stringThree, int imageId){
        locationName = name;
        locationStringTwo = stringTwo;
        locationStringThree = stringThree;
        imageResourceId = imageId;
    }

    /**
     * Get the Location Name
     */
    public String getLocationName(){
        return locationName;
    }

    /**
     * Get the Second Location String object
     */
    public String getLocationStringTwo(){
        return locationStringTwo;
    }

    /**
     * Get the Third Location String object
     */
    public String getLocationStringThree(){
        return locationStringThree;
    }


    /**
     * Get the Fourth Location String object
     */
    public String getLocationStringFour(){
        return locationStringFour;
    }

    /**
     * Returns whether or not there is a text for this Location object
     */
    public boolean noFourthText() {
        return locationStringFour.equals(NO_FOURTH_TEXT_PROVIDED);
    }

    /**
     * Get the corresponding image resource ID for this Location
     */
    public int getImageResourceId(){
        return imageResourceId;
    }
}