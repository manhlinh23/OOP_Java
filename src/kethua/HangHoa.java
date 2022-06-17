/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class HangHoa {
    protected int mahanghoa;
    protected String tenhanghoa;
    protected float giahanghoa;

    public HangHoa() {
    }

    public HangHoa(int mahanghoa, String tenhanghoa, float giahanghoa) {
        this.mahanghoa = mahanghoa;
        this.tenhanghoa = tenhanghoa;
        this.giahanghoa = giahanghoa;
    }

    public void nhapHangHoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ma hang hoa :");
        this.mahanghoa = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten hang hoa :");
        this.tenhanghoa = sc.nextLine();
        System.out.print("Nhap gia hang hoa :");
        this.giahanghoa = sc.nextFloat();
    }
    
    public void xuatHangHoa() {
       System.out.print("\nMa hang hoa: " + this.mahanghoa + " Ten hang hoa: " + this.tenhanghoa + " Gia hang hoa: " + this.giahanghoa + "$" );
    }
    
    public int getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(int mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public float getGiahanghoa() {
        return giahanghoa;
    }

    public void setGiahanghoa(float giahanghoa) {
        this.giahanghoa = giahanghoa;
    }
    
    
}
