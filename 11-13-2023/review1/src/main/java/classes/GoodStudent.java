/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author caoli
 */
public class GoodStudent extends Student{
    public String monHoc;
    public int ranking;

    public GoodStudent(int id, String name, String classroom, String monHoc, int ranking) {
        super(id, name, classroom);
        this.monHoc = monHoc;
        this.ranking = ranking;
    }

    public GoodStudent() {
    }

    public String getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
}
