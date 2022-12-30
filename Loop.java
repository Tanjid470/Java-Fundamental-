
package basicjava;
import java.util.Scanner;


public class Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i=1,n;
        System.out.print("Enter the value: ");
        n=input.nextInt();
        
        
    //For loop
        
        
        for(int a=i;a<=3;a+=2)
        {
            System.out.println("Tanjid");
        }        
    
        
    //While loop
    
    
        while(i<=4)
        {
           System.out.println("Hossain"); 
           i+=2;
           
        }
   
        
    //do....While loop
    
    
        do
        {
            System.out.println("Amran"); 
            n++;
        }while(n>4);
            
    }
    
}
