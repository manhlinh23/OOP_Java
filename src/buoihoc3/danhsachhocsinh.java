/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoihoc3;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class danhsachhocsinh {
    private hocsinh hs[];
    private int quantity;

    public danhsachhocsinh() {
    }
    
    

    public void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input quantity of array:");
        this.quantity = sc.nextInt();
        hs = new hocsinh[quantity];
        for(int i=0; i< this.quantity; i++){
            System.out.println("------------------- Student number " + (i+1) + "-------------------");
            hs[i] = new hocsinh();
            hs[i].input();
        }
    }
    
    public void outputArray(){
//        System.out.println("------------- Array of student -------------");
//        for(int i=0; i< this.quantity; i++){
//            hs[i].output();
//        }
        
           String leftAlignFormat = "| %d      | %-15s   |  %d       |%n";

System.out.format("+--------+-------------------+----------+%n");
System.out.format("| ID     | Name              |  Score   |%n");
System.out.format("+--------+-------------------+----------+%n");
for (int i=0; i< this.quantity; i++) {
    System.out.format(leftAlignFormat,hs[i].getId(), hs[i].getName(), hs[i].getScore());
}
System.out.format("+--------+-------------------+----------+%n");
    }
    
    public hocsinh[] getHs() {
        return hs;
    }

    public void setHs(hocsinh[] hs) {
        this.hs = hs;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
