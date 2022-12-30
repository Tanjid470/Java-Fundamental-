

package basicjava;
import java.util.Scanner;

public class NSUTest {
    public static void main(String[] args) {
        
        
           
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.print("Enter any number1:");
        num1=input.nextInt();
        /*int num2;
        System.out.print("Enter any number2:");
        num2=input.nextInt();*/
        if(num1>=100)
        {
        int H=num1/100;
        System.out.println(+H);
        int h=num1%100;
            if(h>=50)
            {
              int HH=h/50;
              System.out.println(+HH);
              int hh=h%50;
              
              if(hh>=20)
              {
              int HHH=hh/20;
              System.out.println(+HHH);
              int hhh=hh%20;
                     if(hhh>=10)
                      {
                        int HHHH=hhh/10;
                        System.out.println(+HHHH);
                        int hhhh=hhh%10;
                                
                      if(hhhh>=2)
                      {
                        int HHHHH=hhhh/2;
                        System.out.println(+HHHHH);
                        int hhhhh=hhhh%2;
                  
                     
                      if(hhhhh>=1)
                      {
                        int HHHHHH=hhhhh/1;
                        System.out.println(+HHHHHH);
                        int hhhhhh=hhhhh%1;
                  
                      }
                  
                      }
                  
              }
            }
            
        }
        }
       
    }
    
}
    
        
        
        
   

