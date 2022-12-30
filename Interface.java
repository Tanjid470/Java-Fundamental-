
package basicjava;

import java.util.Scanner;


public interface Interface {
    public abstract void see();
   public static final int name=30;
    
    
}
 interface Interface2 {
    public abstract void see2();
    
}
class Display implements Interface,Interface2{
    public void see(){ 
        System.out.println("I am Interface");
    }
    
    public void see2(){ 
        System.out.println("I am Interface2");
    }
   
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Display d= new Display();
        d.see();
        d.see2();
        Interface i;
        System.out.println(""+d.name);
        
    }
}