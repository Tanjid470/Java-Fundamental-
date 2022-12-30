
package basicjava;

import java.util.Scanner;



public class Encapsulation {
    private String name;
    private int contact;

    
            //E N C A P S U L A T I O N
    
    public void  set()
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the name:");
      name=input.next();
      System.out.print("Enter the contact info:");
      contact=input.nextInt();
    }
    
    public void set2(String name,int contact)//Formula 2
    {  
      this.name=name;
      this.contact=contact;
    }
    
    
    public void display(int x)
    {
        int count=x;
        System.out.println(+count+" Name    :"+this.name);
        System.out.println(+count+" Contact :"+this.contact);
        System.out.println("");
    }
    
    public static void main(String[] args) {
       
        
        Scanner input = new Scanner(System.in);
        Encapsulation ob=new Encapsulation();
        Encapsulation ob2=new Encapsulation();
        ob.set();
        ob2.set2("Tanjid",01645144735);//Formula 2
        ob.display(1);
        ob2.display(2);//Formula 2
        
        
    }
    
}
