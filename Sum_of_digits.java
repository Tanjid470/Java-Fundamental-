
package basicjava;

import java.util.Scanner;


public class Sum_of_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,temp,rslt;
       int sum=0;
        System.out.print("Enter a value :");
        n=(int) input.nextDouble();
        int count = 0;
             System.out.print("In reverse order:");
        while(n !=0)
        {
            temp=n%10;
            sum=(int) (sum+temp);
            System.out.println("sum"+sum);
            System.out.println(+temp+"temp");
            n=n/10;
            System.out.println("n"+n);
           
        }
          
       
        System.out.print("\nSum of digits :"+sum);
        System.out.println("\n\n");
            
      
        
        
    }
    
}
