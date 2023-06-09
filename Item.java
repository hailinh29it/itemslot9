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
public class Item {

    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
       
        Scanner sc = new Scanner(System.in);
        int check = 1;
        do {
            try {
                System.out.println("Input your value ");
                value = Integer.parseInt(sc.nextLine());
              //  if(value <0 ) throw new Exception();
                System.out.println("Input your creator( not empty) ");
                this.creator= sc.nextLine();
                 if(creator.isEmpty()|| value <0) throw new Exception();
                check = 0;
            } catch (Exception e) {
                System.out.println("--  Please input again!  --");
                check =1;
            }
        } while (check == 1);

    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }

}
