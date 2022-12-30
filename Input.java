
package basicjava;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        int i=10;
        boolean b=true;
        short s=3;
           
           System.out.println(+i); 
           System.out.println("b="+b); 
           System.out.println(+s); 
           
           
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("Enter any number:");
           number=input.nextInt();
           
        
           System.out.println(number);
           
           
                   }
    
}
