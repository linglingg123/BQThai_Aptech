package classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caoli
 */
public class Student {
    private int id;
    private String name;
    private String classroom;
    private int age;

    public Student(int id, String name, String classroom) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
    }

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String name, String classroom, int age) {
        this.id = id;
        this.name = name;
        this.classroom = classroom;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", classroom=" + classroom + '}';
    }
    
    
}
