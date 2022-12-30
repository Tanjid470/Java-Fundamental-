
package basicjava;

import java.util.Scanner;

// Static mrthod can,t call any not static method
public class Static_Method
{

    static void tanjid()
    {
        System.out.println("DEMO");
    }
        
}
 
class tanjid1{
   static int x=10;//static variable
    static void t()
    {
        //n();       Static mrthod can,t call any not static method
        System.out.println(x);// static method can't print or hold non-static variable
        System.out.println("Static"); 
    }
    public void n()
    {
        
        System.out.println("Public");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //decleration  by class name
        tanjid1.t();
        Static_Method.tanjid(); // to call Static method don't need create object            
        //decleration by object
        tanjid1 student1=new tanjid1();
        
        
        student1.n();
    }
}
