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
public class DienThoai extends HangHoa{
    private String loaidienthoai;
    private int dungluong;
    private String hedieuhanh;

    public DienThoai() {
    }

    public DienThoai(int mahanghoa, String tenhanghoa, float giahanghoa) {
        super(mahanghoa, tenhanghoa, giahanghoa);
    }

    public void nhapDienThoai() {
        super.nhapHangHoa();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai dien thoai: ");
        this.loaidienthoai = sc.nextLine();
        System.out.print("Nhap dung luong dien thoai: ");
        this.dungluong = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap he dieu hanh dien thoai: ");
        this.hedieuhanh = sc.nextLine();
        
    }
    
    public void xuatDienThoai() {
        super.xuatHangHoa();
        System.out.print(" Loai dien thoai: " + this.loaidienthoai + " dung luong: " + this.dungluong + "GB" + " he dieu hanh: " + this.hedieuhanh);

    }
    
    public String getLoaidienthoai() {
        return loaidienthoai;
    }

    public void setLoaidienthoai(String loaidienthoai) {
        this.loaidienthoai = loaidienthoai;
    }

    public int getDungluong() {
        return dungluong;
    }

    public void setDungluong(int dungluong) {
        this.dungluong = dungluong;
    }

    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }
    
    
    
}
