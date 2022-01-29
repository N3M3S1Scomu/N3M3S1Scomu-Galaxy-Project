package com.company;

public class alfarobot implements alfa {
    private final int boy=360; //cm
    private final String gorev="bina yapar";
    @Override
    public void BoyYaz() {
        System.out.println(this.boy);
    }

    @Override
    public void bina_yap() {
        System.out.println(this.gorev);
    }
}
