package com.vertanzil.testproject.utils;

/**
 * Created by Kyle on 22/07/2017.
 */
public enum OliveName {

    OLIVE1("Olive 1"), OLIVE2("Olive 2"), OLIVE3("Olive 3");

    private String name;


    OliveName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
