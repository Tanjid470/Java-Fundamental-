
package basicjava;

import java.util.Scanner;


public class Static_Variable {
  static  int count=0;
   Static_Variable()
           
    {
        count++; 
    }
    void see()
    {
        System.out.println(""+count); 
    }
    
}
 class See
{
    
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Static_Variable s1=new Static_Variable();
         s1.see();
         Static_Variable s2=new Static_Variable();
         s2.see();
         Static_Variable s3=new Static_Variable();
         s3.see();
         
     }
}
