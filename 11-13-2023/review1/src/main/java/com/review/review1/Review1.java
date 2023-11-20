/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.review.review1;

import classes.GoodStudent;
import classes.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author caoli
 */
public class Review1 extends Thread {

    public static void main(String[] args) {
        Review1 thread1=new Review1();
        thread1.start();
        
        Thread thread2=new Thread();
        Thread thread3=new Thread();
        
        thread2.start();
    }
    
    @Override
    public void run() {
        Scanner s=new Scanner(System.in);
        Date d=new Date();
        Student stu=new Student(1, "hhh", "A1");
        GoodStudent stu2=new GoodStudent(2, "kkk", "A3", "Maths", 1);
        
//        System.out.println(stu2.getName());
//        stu.setClassroom("A123");
//        System.out.println(stu.getClassroom());
        System.out.println(stu2.toString());
        
        
        ArrayList<Student> studentList=new ArrayList<Student>();
//        Number<int> nlist=new Number<int>();
        HashSet list=new HashSet<>();
        studentList.add(stu); // index 0
        studentList.add(stu2); // index 1
        
        System.out.println(studentList.get(1).toString());
        
        Student stu3=new Student(7);
        System.out.println("Enter Student name:");
        String name=s.nextLine();
        stu3.setName(name);
        System.out.println("Enter Student class:");
        String classroom=s.nextLine();
        stu3.setClassroom(classroom);
        try{ //chay
            System.out.println("Enter Student age:");
            int age=s.nextInt();
            stu3.setAge(age);
        }catch(Exception e){ //bat loi
            System.out.println("Error");//tbao loi
        }finally{
            //solution
            
        }
        int r=stu3.getAge();
        System.out.println(r);
      }
    
    
}
