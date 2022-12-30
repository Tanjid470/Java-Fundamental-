
package basicjava;

import java.util.Scanner;


public class Area_perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height;
        System.out.println("Enter the height:");
        height=input.nextInt();
        int wide;
        System.out.println("Enter the wide  :");
        wide=input.nextInt();
        int area,perimeter;
        area=(int) (height*wide*0.5);
        perimeter=2*(height+wide);
            System.out.println("Area of a triangle      :--"+area);
            System.out.println("Perimeter of a triangle :--"+perimeter);
        
       
        
    }
    
}
