package com.example.android.tourguideappabujanigeria;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate Fragment for a view pager
 */
public class LocationFragmentAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context appContext;

    /**
     * Create a new Location Fragment Adapter object
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's
     *                state across swipes.
     */
    public LocationFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        appContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SightsFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new HotelsFragment();
            case 3:
                return new MarketsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return appContext.getString(R.string.category_sights);
            case 1:
                return appContext.getString(R.string.category_parks);
            case 2:
                return appContext.getString(R.string.category_hotels);
            case 3:
                return appContext.getString(R.string.category_markets);
            default:
                return null;
        }
    }
}