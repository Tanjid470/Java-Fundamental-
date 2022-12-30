
package basicjava;

import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int fact = 1;
        
        System.out.print("\n\n\n\t\t\tEnter any value:");
        i=input.nextInt(); 
        for (int j = 1; j <=i; j++) 
        {          
           fact=fact*j;        
        }
        System.out.println("\n\n\t\t\tFactorial of "+i+" :"+fact);  
    }   
}
