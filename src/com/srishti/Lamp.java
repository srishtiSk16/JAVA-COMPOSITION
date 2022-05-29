package com.srishti;

public class Lamp {
    public String getStyle() {
        return style;
    }

    private  String style;


    private boolean battery;
    private int globRating;

    public Lamp(String style ,boolean battery ,int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isBattery(){
        return this.battery;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on | ");
    }
}
