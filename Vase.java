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
public class Vase extends Item {

    private int height;
    private String material;
    Scanner sc = new Scanner(System.in);

    public Vase() {
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        System.out.println("----------Vase----------");
         super.input();
        int check = 1;
        do {
            try {
                System.out.println("Input your height ");
                height = Integer.parseInt(sc.nextLine());
                if(height <0 ) throw new Exception();
                System.out.println("Input your material( not empty) ");
                material = sc.nextLine();
                 if(material.trim().isEmpty()) throw new Exception();
                check = 0;
            } catch (Exception e) {
                System.out.println("--  Please input again!!!! --");
                check =1;
            }
        } while (check == 1);
    }

    @Override
    public String toString() {
        return String.format("VASE:     |v:%-6d|c:%-10s|h:%-6d|m:%-10s|",value,creator,height,material);
    }

}
