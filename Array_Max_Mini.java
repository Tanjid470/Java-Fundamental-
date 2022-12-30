
package basicjava;
import java.util.Scanner;

public class Array_Max_Mini {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number;
        number=new int[5];
        int max=number[0];
        System.out.print("Enter the value : ");
        for (int i = 0; i <5; i++) 
        {
           number[i]=input.nextInt();
        }
        for (int m = 0; m < number.length; m++)
        {           
            if(max<number[m])
           {
               max=number[m];
           }  
        }
    System.out.println("Max: "+max);
        int len=number.length;
        System.out.println("length:"+len); 
    } 
 
}
