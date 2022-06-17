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
public class DoAn extends HangHoa {
    private String loaidoan;
    private String xuatsu;
    private String hansudung;

    public DoAn() {
        super();
    }
    
    public void nhapDoAn(){
        super.nhapHangHoa();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap loai do an: ");
        this.loaidoan = sc.nextLine();
        System.out.print("Nhap xuat su: ");
        this.xuatsu = sc.nextLine();
        System.out.print("Nhap han su dung: ");
        this.hansudung = sc.nextLine();
    }
    
    public void xuatDoAn() {
    super.xuatHangHoa();
    System.out.print(" Loai do an: " + this.loaidoan + " Xuat su: " + this.hansudung + " Han su dung: " +this.hansudung);
    }

    
    public String getLoaidoan() {
        return loaidoan;
    }

    public void setLoaidoan(String loaidoan) {
        this.loaidoan = loaidoan;
    }

    public String getXuatsu() {
        return xuatsu;
    }

    public void setXuatsu(String xuatsu) {
        this.xuatsu = xuatsu;
    }

    public String getHansudung() {
        return hansudung;
    }

    public void setHansudung(String hansudung) {
        this.hansudung = hansudung;
    }
    
    
}
