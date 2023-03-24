package com.vertanzil.testproject.utils;


public class Olive {


    private OliveName name = OliveName.OLIVE1;
    private long colour = 0x2E0854;
    private int oil = 3;

    public Olive(){}

    public Olive(OliveName name, long colour, int oil){
        this.name = name;
        this.colour = colour;
        this.oil = oil;

    }

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        this.name = name;
    }

    public long getColour() {
        return colour;
    }

    public void setColour(long colour) {
        this.colour = colour;
    }

    public int crush() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
