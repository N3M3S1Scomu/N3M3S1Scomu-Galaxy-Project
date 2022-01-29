package com.company;

public class gamarobot implements gama{
    private final int boy=200;
    private static String gorev="agac dik";

    @Override
    public void BoyYaz() {
        System.out.println(this.boy);
    }

    @Override
    public void gorev_yaz() {
        System.out.println(gorev);
    }

    @Override
    public void gorev_degistir() {
        if (gorev=="agac dik"){
            gorev="bina yap";
            System.out.println(gorev);
        }
        else {
            gorev="agac dik";
            System.out.println(gorev);
        }
    }
}
