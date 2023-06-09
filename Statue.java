/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itemslot9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Statue extends Item {
        
Scanner sc = new Scanner(System.in);
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public void input() {
        System.out.println("----------Statue----------");
        super.input();
        int check = 1;
        do {
            try {
                
                System.out.println("input your weight >=0 and <=1000 ");
                weight = Integer.parseInt(sc.nextLine());
                System.out.println("Input your colour( not empty) ");
                colour = sc.nextLine();
                if (colour.trim().isEmpty() || weight < 0 || weight > 1000) throw new Exception();
               
                check = 0;
            } catch (Exception e) {
                System.out.println("---PLease input again!!!!--- ");
                check = 1;
            }
        } while (check == 1);
    }

    @Override
    public String toString() {
         return String.format("Statue:   |v:%-6d|c:%-10s|w:%-6d|c:%-10s|",value,creator,weight,colour);
    }

}
