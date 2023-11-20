/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.review.review2;

/**
 *
 * @author caoli
 */
public class Thread2 implements Runnable{
    public String input;

    public Thread2(String input) {
        this.input = input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    
    
    @Override
    public void run() {
        switch(input){
            case "Thu hai":
                System.out.println("Monday");
                break;
            case "Thu ba":
                System.out.println("Tuesday");
                break;
            case "Thu tu":
                System.out.println("Wednesday");
                break;
            case "Thu nam":
                System.out.println("Thursday");
                break;
            case "Thu sau":
                System.out.println("Friday");
                break;
            case "Thu bay":
                System.out.println("Saturday");
                break;
            case "Chu nhat":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
    
}
