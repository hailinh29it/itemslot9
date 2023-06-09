/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package itemslot9;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class antiqueshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Itemlist obj = new Itemlist();
        int choice = 0;
        
        do {
            System.out.println("1. add a new vase");
            System.out.println("2. add a new statue");
            System.out.println("3. add a new painting");
            System.out.println("4. display all items");
            System.out.println("5. find the items by the creator and index of it ");
            System.out.println("6. update the item by its index");
            System.out.println("7. remove the item by its index");
            System.out.println("8. display the list of vase items ");
            System.out.println("9. sorts items in ascending order based on their values ");
            System.out.println("10. exit");
            System.out.println("input your choice:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Item tmp1 = new Vase();
                 tmp1.input();
                    if (obj.addItem(tmp1)) {
                        System.out.println("added");
                    }
                    break;
                case 2:
                    Item tmp2 = new Statue();
                    tmp2.input();
                    if (obj.addItem(tmp2)) {
                        System.out.println("added");
                    }
                    break;
                case 3:
                    Item tmp3 = new Painting();
                    tmp3.input();
                    if (obj.addItem(tmp3)) {
                        System.out.println("added");
                    }
                    break;
                case 4:
                    obj.displayAll();
                    break;
                case 5:
                    int check;
                    System.out.println("Input creator your want to find ");
                    String creator = sc.nextLine();
                    check = obj.findItemIndex(creator);
                    if (check == -1) {
                        System.out.println("-Don't have any creator!!-");
                    }
                    else {
                    System.out.println("inforamtion about creator: " + obj.findItem(creator));
                    System.out.println("index of objec: "+check);
                }
                    break;
                case 6:
                    System.out.println("Input index of object you want to update!");
                    int update = sc.nextInt();
                    obj.updateItem(update);
                    break;
                case 7:
                    System.out.println("Input index of object you want to remove!");
                    int remove = sc.nextInt();
                    obj.removeItem(remove);
                    break;
                case 8:
                    System.out.println("input type you want to display");
                    String type = sc.nextLine();
                    obj.displayItemsByType(type);
                    break;
                case 9:
                    System.out.println("SORT object!!");
                    obj.sortItems();
                    System.out.println("After sort");
                    obj.displayAll();
                    break;
                case 10:
                    System.out.println("--------Exit-------");
                    break;
            }
           

        }    
 while (choice <= 9);

        }
}
