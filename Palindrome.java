
package basicjava;
import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,temp;
       int sum=0;
     
        System.out.print("Enter a value :");
        n=(int) input.nextDouble();
      
             System.out.print("In reverse order:");
        while(n !=0)
        {
            temp=n%10;
            sum=sum*10+temp;
            //System.out.print(+temp+"");
            n=n/10;
           
        }
        System.out.println("\n\n\n"+sum);
        if(sum==n)
            System.out.println("This is a palindrome number");
        else
            System.out.println("This is not a palindrome number");
       
        System.out.println("\n\n");
       
    }
    
}
