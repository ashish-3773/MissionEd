package com.missionedappdev.missoned;

public class physics_item {
    private int mImageResource;
    private String mchapter;

    public physics_item(String chapter, int imageResource) {
        mImageResource = imageResource;
        mchapter = chapter;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getMchapter() {
        return mchapter;
    }

}
