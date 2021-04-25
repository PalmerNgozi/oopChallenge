package com.Almerx.oopChallenge;

public class Stomach extends Organ{
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();

        if (this.isEmpty()){
            System.out.println("Needs to eat");
        }else {
            System.out.println("Full");
        }
    }
    public void digest(){
        System.out.println("Digesting begin");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
