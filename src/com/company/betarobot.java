package com.company;

public class betarobot implements beta{

    private final int boy=140; //cm
    private final String gorev="agac diker";

    @Override
    public void BoyYaz() {
        System.out.println(this.boy);
    }

    @Override
    public void agac_dik() {
        System.out.println(this.gorev);
    }
}
