package OOPS;

import java.util.*;
import java.lang.String;

public class GetterAndSetter {
    public static void main(String[] args) {
        Pen1 p1 = new Pen1();
        p1.setColor("red");
        System.out.println(p1.getColor());
        p1.setTip(69);
        System.out.println(p1.getTip());
    }
}

class Pen1 {
    private String color;
    private int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    String getColor() {
        return this.color;
    }

    public int getTip() {
        return this.tip;
    }
}
//this keyword is use for current object
