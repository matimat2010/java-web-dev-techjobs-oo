package org.launchcode.techjobs_oo;

public class PositionType extends JobField{
    public PositionType(String value) {
        super(value);
    }

//    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    @Override
    public String toString() {
        return "PositionType{" +
                "value='" + getValue() + '\'' +
                '}';
    }

//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when

}
