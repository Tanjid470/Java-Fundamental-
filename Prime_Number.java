
package basicjava;

import java.util.Scanner;


public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,count=0;
        System.out.println("Enter any positive value :");
        i=input.nextInt();
        for (int j = 2; j < 10; j++) {
            if (i%j==0) {
                count++;        
                System.out.println(count);
                break;
            }
        
        }
        if(count==0)
        {
            System.out.println("This is prime number");
        }
        else
        {
            System.out.println("This is not prime number");
        }
        
    }
    
}
