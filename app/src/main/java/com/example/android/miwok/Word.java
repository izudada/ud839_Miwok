package com.example.android.miwok;

public class Word {

    /**  Default word translation */
    private String mDefaultTranslation;

    /**  Miwok  translation for the word */
    private String mMiwokTranslation;

    public  Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    /** Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}
