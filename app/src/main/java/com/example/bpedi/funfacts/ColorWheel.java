package com.example.bpedi.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by bpedi on 9/19/2016.
 */
public class ColorWheel {

    // fields member variables

    private String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
            };


    //methonds - actions
    public int getColor() {


        String color;
        //randomly select a fact
        Random randomGenerator = new Random();
        int ranodomNumber = randomGenerator.nextInt(9);
        color = mColors[ranodomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
