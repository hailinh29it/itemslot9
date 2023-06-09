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
public class Painting extends Item {
   Scanner sc = new Scanner(System.in);
    private int height;
    private int Width;
    private boolean isWaterColour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int Width, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.Width = Width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return Width;
    }

    public boolean isIsWaterColour() {
        return isWaterColour;
    }

    public boolean isIsFramed() {
        return isFramed;
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

    public void setWidth(int Width) {
        this.Width = Width;
    }

    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public void input() {
     System.out.println("----------Painting----------");
        super.input();
        int check = 1;
        
        do {
            try {
                
                System.out.println("input your height >=0 and <=2000 ");
                height = Integer.parseInt(sc.nextLine());
                System.out.println("input your width >=0 and <=3000 ");
                Width = Integer.parseInt(sc.nextLine());
    if (Width < 0 || Width > 3000||height < 0 || height > 2000)   throw new Exception(); 
                  
              
                check = 0;
            } catch (Exception e) {
                System.out.println("Please input again ");
                check = 1;
            }
        } while (check == 1);       
    }

    @Override
    public String toString() {
        return String.format("Painting: |v:%-6d|c:%-10s|h:%-6d|w:%-10s|",value,creator,height,Width);
    }
    
}
