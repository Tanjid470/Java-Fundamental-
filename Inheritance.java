
package basicjava;

import java.util.Scanner;

public class Inheritance {
    String name="Tanjid";
    int id=200101470;
    
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("ID   :"+id);
        
    }
    
}
        // I N H E R I T A N C E 
 class inheritance2 extends Inheritance

{
    String name2="Hosen";
    
    public void display2()        
    {
       display();
       System.out.println("Name2:"+name2);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inheritance2 ob=new inheritance2();
        ob.display2();
        
    }
}