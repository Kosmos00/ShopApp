package kaito.choice.kaito.choice;

import java.sql.SQLOutput;
import java.util.Arrays;
public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Kevin's Shop");
        Customer c1 = new Customer("Kevin", 3);
        System.out.println("Customer is " + c1.name);
        System.out.println("Min price:" + Clothing.min_price);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing[] array = new Clothing[5];
        array[0] = item1;
        array[1] = item2;
        array[2] = item2;
        array[3] = item3;
        array[4] = item4;
        c1.addItems(array);
        Arrays.sort(c1.getItems());
        for (Clothing item : c1.getItems()){
            System.out.println("Item Output:" + item);
        }
        System.out.println("Item:" + item1.toString());
        System.out.println("Item:" + item2.toString());
        System.out.println("Item:" + item3.toString());
        System.out.println("Item:" + item4.toString());
        c1.setSize(3);
        for (int i = 0; i < array.length; i++) {
            array[i].description();
            boolean passed = false;
            if (array[i].size == "S") {
                passed = true;
            }
            if (passed) {
                System.out.println("Customer fits in this clothes");
            } else {
                System.out.println("Customer doesn't fit in this clothes");
            }
        }
        System.out.println("Kevin Size is:" + c1.size);
        c1.addItems(array);
        System.out.println("Total:" + c1.getTotalClothingCost());
    }
}
