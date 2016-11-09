package com.example.syedinkisarahmed.databasewithfragment;

/**
 * Created by Syed Bakhtiyar on 11/8/2016.
 */
public class Record {
    String name;
    int roll;

    public Record(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
}
