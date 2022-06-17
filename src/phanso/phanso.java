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
public class phanso {
    private int mauSo;
    private int tuSo;

    public phanso(int mauSo, int tuSo) {
        this.mauSo = mauSo;
        this.tuSo = tuSo;
    }

    public phanso() {
    }

    public void nhapDulieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so:");
        this.tuSo = scanner.nextInt();
        System.out.println("Nhap mau so:");
        this.mauSo = scanner.nextInt();

    }
    public int timUSCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
	
	public void toiGianPhanSo() {
		int i = timUSCLN(this.getTuSo(), this.getMauSo());
		this.setTuSo(this.getTuSo() / i);
		this.setMauSo(this.getMauSo() / i);
                System.out.println("Phan so toi gian: " + this.tuSo + "/" + this.mauSo);
	}
        
    public void traPhanSo(){
        System.out.println("Phan so vua nhap: " + this.tuSo + "/" + this.mauSo);
    }
    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }
    
    
}
