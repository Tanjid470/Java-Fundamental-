
package basicjava;

import java.util.Scanner;


public class Array_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    String car="Tanjid Amran";
        String[] car2={"tanvir","tanjid"};
        System.out.println("\n"+car.length());
        System.out.println("\n"+car2.length);
        int[] a={1020,80,90};
         System.out.println(a.length);
         
         
         
         
         int[] b=new int[10];
         for (int i = 0; i < b.length; i++) {
             b[i]=input.nextInt();
             System.out.println(""+b[i]);
             if(i==2){
                 
                 break;}
           
            
        }
        
     }
}
