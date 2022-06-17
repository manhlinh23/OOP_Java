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
public class DSHH {
    private HangHoa hs[];
    private int sl;


    public void nhapDSHH(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luog san pham: ");
        this.sl = sc.nextInt();
        
        hs = new HangHoa[this.sl];
        int loai;
        for(int i=0 ; i< this.sl;i++){
            System.out.print("Nhap loai hang can nhap (0: dien thoai, 1: do an)");
            loai = sc.nextInt();
            
            if(loai == 0){
                DienThoai dt = new DienThoai();
                dt.nhapDienThoai();
                hs[i] = dt;
            }else if(loai == 1){
                DoAn dt = new DoAn();
                dt.nhapDoAn();
                hs[i] = dt;
            }
        }
    }
    
    public void xuatDSHH(){
                for(int i=0 ; i< this.sl;i++){
                    if(hs[i] instanceof DienThoai){
                        DienThoai h = new DienThoai();
                        h= (DienThoai) hs[i];
                        h.xuatDienThoai();
                    }else{
                        DoAn h = new DoAn();
                        h= (DoAn) hs[i];
                        h.xuatDoAn();
                    }
                }
                 
    }
    
    public void xuatDSHHTheoLoai(int loai){
        for(int i=0;i<this.sl;i++){
            if(loai == 0){
                if(hs[i] instanceof DienThoai){
                        DienThoai h = new DienThoai();
                        h= (DienThoai) hs[i];
                        h.xuatDienThoai();
                    }
            }else if(loai == 1){
                if(hs[i] instanceof DoAn){
                    DoAn h = new DoAn();
                        h= (DoAn) hs[i];
                        h.xuatDoAn();
                }
            }
        }
    }
    public HangHoa[] getHs() {
        return hs;
    }

    public void setHs(HangHoa[] hs) {
        this.hs = hs;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    
}
