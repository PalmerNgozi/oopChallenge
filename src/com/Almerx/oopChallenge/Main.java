package com.Almerx.oopChallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Patient patient = new Patient("Agnes", 22,new Eye("Left EYe", "Short Sighted", "Brown", true),
                new Eye("Right Eye", "Normal", "Blue", true),
                new Heart("Heart", "Beating", 65), new Stomach("Stomach ", "Digesting", false),
                new Skin("Skin", "Normal", "Black",12)) ;

        System.out.println("Name: "+patient.getName());
        System.out.println("Age: " +patient.getAge());

        Scanner scanner = new Scanner(System.in);


        boolean shouldFinish=false;
        while (!shouldFinish) {
            System.out.println("Choose an Organ" +
                    "\n\t1. Left Eye" +
                    "\n\t2. Right EYe" +
                    "\n\t3. Heart"+
                    "\4n\t4. Stomach"+
                    "\n\t5. Skin" +
                    "\n\t6. Quit");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened())
                    {
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt()==1) {
                            patient.getLeftEye().close();
                        }else {
                            continue ;
                        }
                    }else {
                        System.out.println("\t\t1.Open the Eye ");
                        if (scanner.nextInt()==1){
                            patient.getLeftEye().open();
                    }else {
                            continue;
                        }

                }
                    break;

                case 2 :
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened())
                    {
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt()==1) {
                            patient.getRightEye().close();
                        }else {
                            continue ;
                        }
                    }else {
                        System.out.println("\t\t1.Open the Eye ");
                        if (scanner.nextInt()==1){
                            patient.getRightEye().open();
                        }else {
                            continue;
                        }

                    }
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    System.out.println("\t\t1. Change HeartRate");
                    if (scanner.nextInt()==1){
                        System.out.println("Enter a new heart rate");
                        int rates= scanner.nextInt();
                        patient.getHeart().setRate(rates);
                        System.out.println("heart rate changed to "+ patient.getHeart().getRate());
                    }else {
                        continue;
                    }
                    break;

                case 4 :
                    patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if (scanner.nextInt()==1) {
                        patient.getStomach().digest() ;
                    }else {
                        continue;

                    }
                    break ;

                case 5:
                    patient.getSkin().getDetails();

                    break;
                default :
                    shouldFinish=true;
                    break;

            }
        }
    }
}
