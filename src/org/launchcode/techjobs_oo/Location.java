package org.launchcode.techjobs_oo;


public class Location extends JobField {

    public Location(String value) {
        super(value);
    }


    @Override
    public String toString() {
        return getValue();
    }
}


