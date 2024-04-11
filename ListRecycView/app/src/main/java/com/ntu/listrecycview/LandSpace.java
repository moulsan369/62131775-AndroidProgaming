package com.ntu.listrecycview;

public class LandSpace {
    String landImageFN;
    String landCaption;

    public LandSpace(String landImageFN, String landCaption) {
        this.landImageFN = landImageFN;
        this.landCaption = landCaption;
    }

    public String getLandImageFN() {
        return landImageFN;
    }

    public void setLandImageFN(String landImageFN) {
        this.landImageFN = landImageFN;
    }

    public String getLandCaption() {
        return landCaption;
    }

    public void setLandCaption(String landCaption) {
        this.landCaption = landCaption;
    }
}
