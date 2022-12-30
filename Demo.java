
package basicjava;

import java.util.Scanner;


public class Demo {

    static void tanjid()
    {
        System.out.println("DEMO");
 
                
    }
        
    }
 
class tanjid{
    static void t()
    {
        System.out.println("Static"); 
    }
    public void n()
    {
        
        System.out.println("Public");
    }
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        tanjid.t();
        tanjid student1=new tanjid();
        Demo.tanjid();
        
        student1.n();
    }
}
