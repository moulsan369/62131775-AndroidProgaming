package com.ntu.coffehouse.models;

import android.app.Activity;

public class Country extends Activity {
    String imageFile;
    int numberPeoples;

    String nameCoutry;

    public Country(String imageFile, int numberPeoples, String nameCoutry){
        this.imageFile = imageFile;
        this.nameCoutry = nameCoutry;
        this.numberPeoples = numberPeoples;
    }

    public String getImageFile(){
        return imageFile;
    }

    public String getNameCoutry(){
        return nameCoutry;
    }

    public int getNumberPeoples(){
        return numberPeoples;
    }

}
