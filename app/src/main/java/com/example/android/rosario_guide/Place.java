package com.example.android.rosario_guide;

/**
 * {@link Place} represents a particular place in Rosario.
 * It contains the name of the place, contact information and image.
 */
public class Place {

    /** Default translation for the word */
    private String mNameOfThePlace;

    /** Miwok translation for the word */
    private String mContactInfo;

    /** Image resource ID for the word */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param nameOfThePlace is the name of the bar/restaurant/cafe (depending on the category)
     * @param contactInfo is the address of the place
     * @param imageResourceId is the drawable resource ID for the image associated with the place
     */
    public Place(String nameOfThePlace, String contactInfo, int imageResourceId) {
        mNameOfThePlace = nameOfThePlace;
        mContactInfo = contactInfo;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the place.
     */
    public String getTheNameOfThePlace() {
        return mNameOfThePlace;
    }

    /**
     * Get the address of the place.
     */
    public String getTheContactInfo() {
        return mContactInfo;
    }

    /**
     * Return the image resource ID of the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}