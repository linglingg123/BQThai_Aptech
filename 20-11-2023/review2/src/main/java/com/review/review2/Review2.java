/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.review.review2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author caoli
 */
public class Review2 extends Thread{

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1=new Thread1();
        Thread a=new Thread(t1);
        a.start();
        a.join();
        String input = t1.getDate();
        Thread2 t2=new Thread2(input);
        Thread b=new Thread(t2);
        b.start();
    }
    
}
