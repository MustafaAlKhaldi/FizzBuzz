package com.company.model;

import java.util.ArrayList;

public class FBCounter {
    //Attributes
    private ArrayList original;


    //Constructors
    public FBCounter() {

    }

    public FBCounter(int count) {
        original = new ArrayList<Integer>(count);
    }

    //Methods

    public ArrayList getOriginal() {
        return original;
    }

    public void setOriginal(ArrayList original) {
        this.original = original;
    }

}
