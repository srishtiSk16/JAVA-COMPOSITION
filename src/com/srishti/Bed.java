package com.srishti;

public class Bed {

    private String style;
    private int pillows;
    private int sheets;
    private int height;
    private int quilt;

    public Bed(String style, int pillows, int sheets, int height, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.quilt = quilt;
        this.sheets = sheets;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getHeight() {
        return height;
    }

    public int getQuilt() {
        return quilt;
    }
    public void make(){
        System.out.println("Bed -> Making | ");

    }
}
