package com.Almerx.oopChallenge;

import java.util.Scanner;

public class Heart extends Organ {
    private int rate ;

    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }
    @Override
    public void getDetails() {
        super.getDetails() ;
        System.out.println("Rate : "+ this .getRate());
    }
    public void changeRate(){
        //System.out.println(this.setRate());
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}