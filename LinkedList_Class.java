
package basicjava;

import java.util.Scanner;
import java.util.LinkedList;


public class LinkedList_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> cars=new LinkedList<>();
        
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Volva");
        cars.add("Tesla");
        System.out.println(cars);
        
        cars.addFirst("Tanjid");
        cars.addLast("Amran");
        System.out.println(cars);
        
        cars.removeFirst();
        cars.removeLast();
        cars.remove(2);
        System.out.println(cars);
        
        String x = cars.getFirst();
          System.out.println(x);
        
        
    }
    
}
