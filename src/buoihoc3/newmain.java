/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoihoc3;

/**
 *
 * @author macbookair
 */
public class newmain {
    
    public static void main(String[] args){
    String leftAlignFormat = "| %d      | %s   |  %-2d      |%n";

System.out.format("+--------+---------------+----------+%n");
System.out.format("| ID     | Name          |  Sroce   |%n");
System.out.format("+--------+---------------+----------+%n");
for (int i = 0; i < 5; i++) {
    System.out.format(leftAlignFormat,i, "sinh vien " + 1, 10);
}
System.out.format("+--------+---------------+----------+%n");
    }
    
}
