package com.example.android.rosario_guide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.rosario_guide.IceCreamFragment;
import com.example.android.rosario_guide.R;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DinnerFragment();
        } else if (position == 1) {
            return new BreakfastFragment();
        } else if (position == 2) {
            return new IceCreamFragment();
        } else {
            return new DrinksMusicFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_dinner);
        } else if (position == 1) {
            return mContext.getString(R.string.category_breakfast);
        } else if (position == 2) {
            return mContext.getString(R.string.category_ice_cream);
        } else {
            return mContext.getString(R.string.category_drinks_and_music);
        }
    }
}