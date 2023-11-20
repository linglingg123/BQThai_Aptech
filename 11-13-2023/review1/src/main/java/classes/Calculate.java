package classes;


import classes.ExampleInterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caoli
 */
public class Calculate implements ExampleInterface{
    private int a;
    private int b;

    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePlus() {
       return a+b;
    }

    @Override
    public double calculateMinus() {
        return a-b;
    }

    @Override
    public double calculateMultiply() {
        return a*b;
    }

    @Override
    public double calculateSub() {
        return a/b;
    }
    
    
}
