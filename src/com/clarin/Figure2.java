package com.clarin;

public class Figure2 extends Thread {
    static int i = 0;

    @Override
    public void run() {
        System.out.println("running..." + i++);
    }

    public static void main(String[] args) {
        Figure2 t1 = new Figure2();
        Figure2 t2 = new Figure2();

        System.out.println("Name of t1 :" +t1.getName() +i++);
        System.out.println("Name of t2 :" +t2.getName() +i++);
        System.out.println("id of t1 :" +t1.getId() +i++);
        t1.start();
        t2.start();
        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" +t1.getName() + --i);
        System.out.println("i = " + i);

    }
}
