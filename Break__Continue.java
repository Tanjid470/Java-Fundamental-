
package basicjava;

import java.util.Scanner;


public class Break__Continue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i;
        
//Break keyword
System.out.println("\n\n\t\t\t\t\tBreak");
        for(i=1;i<10;i++)
        {
            if(i==5)
                break;
            System.out.println(+i);
            
        }
        
//continue keyword

       System.out.println("\n\n\t\t\t\t\tContinue");
        for(i=1;i<10;i++)
        {
            if(i==5)
                continue;
            System.out.println(+i);
            
            
        }
        
    }
    
}
