/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class dsphanso {
    private phanso ds[];
    private int sl;

    public dsphanso() {
    }

    public dsphanso(phanso[] ds, int sl) {
        this.ds = ds;
        this.sl = sl;
    }

    public void nhapDS(){
        System.out.println("Nhap so luong phan tu:");
        Scanner sc = new Scanner(System.in);
        this.setSl(sc.nextInt());
        this.setDs(new phanso[this.getSl()]);
        for(int i=0;i<this.getSl();i++){
            getDs()[i] = new phanso();
            getDs()[i].nhapDulieu();
        }
    }
    public void traDs(){
           for(int i=0;i<this.getSl();i++){
            getDs()[i].traPhanSo();
        }
    }
    public phanso[] getDs() {
        return ds;
    }

    public void setDs(phanso[] ds) {
        this.ds = ds;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
}
