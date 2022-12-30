
package basicjava;
import java.util.Scanner;


public class Condition 
{
    public static void main(String[] args) 
            
    {
     
        Scanner input=new Scanner(System.in);
        int value;
       
        System.out.print("Enter any number:");
         value=input.nextInt();
         
         
        //If....else condition
        
        if(value%2==0)
            {
             System.out.println("The odd :" +value);
            }
        else
            {
             System.out.println("The even :" +value);
            }
        
        
        //switch case
           
        int i;
        System.out.print("Enter the any number");
        i=input.nextInt();
        switch(i)
        {
            case 1:
                
                 System.out.println("One");
                   break;
                         case 2:
                 System.out.println("Two");
                   break;
                         case 3:
                 System.out.println("Three");
                   break;
                         case 4:
                 System.out.println("Four");
                 break;
                         default:
                 System.out.println("More then 4");
                
        }
        int num1,num2,large;
         System.out.print("Enter 2 number\n");
        num1=input.nextInt();
       
        num2=input.nextInt();
        large=(num1>num2) ? num1:num2;
        System.out.print(+large);
        
        
        
    }
    
}
