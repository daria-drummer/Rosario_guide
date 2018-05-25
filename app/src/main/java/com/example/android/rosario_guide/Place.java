package com.example.android.miwok;

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
     * @param nameOfThePlace is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param contactInfo is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(String nameOfThePlace, String contactInfo, int imageResourceId) {
        mNameOfThePlace = nameOfThePlace;
        mContactInfo = contactInfo;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getTheNameOfThePlace() {
        return mNameOfThePlace;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getTheContactInfo() {
        return mContactInfo;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}