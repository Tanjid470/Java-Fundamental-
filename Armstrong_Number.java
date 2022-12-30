
package basicjava;

import java.util.Scanner;


public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,temp,r;
       int sum=0;
     
        System.out.print("Enter a value :");
        r=(int) input.nextDouble();
        n=r;
      
             //System.out.print("In reverse order:");
        while(n !=0)
        {
            temp=n%10;
            temp=temp*temp*temp;
            sum=sum+temp;
            //System.out.print(+temp+"");
            n=n/10;
           
        }
        System.out.println(""+sum);
        if(sum ==r)
            System.out.println("This is a Armstrong number");
        else
            System.out.println("This is not  a Armstrong number");
       
        System.out.println("\n\n");
       
    }
    
}
