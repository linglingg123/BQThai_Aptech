package com.review.review2;


import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caoli
 */
public class Thread1 implements Runnable{
    public String date;

    public Thread1() {
    }
    
    @Override
    public void run() {
        Random r=new Random(); //input int, float, double
                ArrayList<String> Vday=new ArrayList<>();
                Vday.add("Thu hai");
                Vday.add("Thu ba");
                Vday.add("Thu tu");
                Vday.add("Thu nam");
                Vday.add("Thu sau");
                Vday.add("Thu bay");
                Vday.add("Chu nhat");
                
//                r.nextInt(Vday.size());
                date=Vday.get(r.nextInt(Vday.size()));
                System.out.println(date);
        return;
    }
    
    public String getDate() {
        return date;
    }
    
}
