package buoihoc3;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author macbookair
 */
public class hocsinh {
    private String name;
    private int id;
    private int score;

    public hocsinh() {
    }

    public hocsinh(String name, int id, int score) {
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert name of student");
        this.name = sc.nextLine();
        System.out.println("Insert ID of student");
        this.id = sc.nextInt();
        System.out.println("Insert score of student");
        this.score = sc.nextInt();
    }
    
    public void output(){
        System.out.println("ID: " + this.id + " Name: " + this.name + " Score: " + this.score);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
}
