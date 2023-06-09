/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itemslot9;

/**
 *
 * @author PC
 */
public class Itemlist {

    Item[] list;   // an array to store all items
    int numOfItem;  // to store the number of items that added to the list
    final int MAX = 100;   // is the size of the array

    public Itemlist() {
        list = new Item[MAX];
        numOfItem = 0;
    }
    //this mothod add an Item object to the list
    //input: a new item that needs to add
    //output: return true/false      

    public boolean addItem(Item item) {
        if (item == null || numOfItem >= MAX) {
            return false;
        }
        list[numOfItem] = item;
        numOfItem++;
        return true;
    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("the list is empty");
        }
        for (int i = 0; i < numOfItem; i++) {
            System.out.println(list[i]);
        }

    }

    public Item findItem(String creator) {
        for (int i = 0; i < numOfItem; i++) {

            if(list[i].getCreator().equals(creator))
            return list[i];
        }
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if(list[i].getCreator().equals(creator))
                return i;
        }
        return -1;
    }

    public boolean updateItem(int index) {
        if (index >= 0 && index < numOfItem) {
            list[index].input();
            return true;
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < numOfItem) {
            for (int j = index; j < numOfItem; j++) {
                list[j] = list[j + 1];
            }
            numOfItem--;
            return true;
        }
        return false;
    }

    public void displayItemsByType(String type) {

        if (type.equals("Vase")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Vase) {
                    System.out.println(list[i]);
                }
            }
        } else if (type.equals("Statue")) {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Statue) {
                    System.out.println(list[i]);
                }
            }
        } else {
            for (int i = 0; i < numOfItem; i++) {
                if (list[i] instanceof Painting) {
                    System.out.println(list[i]);
                }
            }
        }
    }

    public void sortItems() {
      
        for (int i = 0; i < numOfItem-1; i++) {
            for (int j = i+1; j < numOfItem; j++) {
                if(list[i].getValue()>list[j].getValue()){
                    Item tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
          
        }
//for (int i = 0; i < numOfItem - 1; i++) {
//        int min_idx = i;
//        for (int j = i + 1; j < numOfItem; j++) {
//            if (list[j].getValue() < list[min_idx].getValue()) {
//                // Tìm phần tử có giá trị nhỏ nhất trong đoạn chưa được sắp xếp
//                min_idx = j;
//            }
//        }
//        // Đổi chỗ phần tử có giá trị nhỏ nhất với phần tử đầu tiên trong đoạn chưa được sắp xếp
//        Item tmp = list[i];
//        list[i] = list[min_idx];
//        list[min_idx] = tmp;
//    }
//
}
}
