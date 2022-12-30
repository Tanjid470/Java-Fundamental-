
package basicjava;

import java.util.Scanner;

public class Oop_Constructor {
    
String name;
    int id; 
    //Creating Method
    Oop_Constructor(String x,int y)
    {
      this(); // Here this keyword use to call(Autometical)
              //defult constructor
        name=x;
        id=y;
        Output();
 
    }
    Oop_Constructor()
    {
        System.out.println("Defult constractor");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the name :");
        name=input.next();
        System.out.print("Enter the Id   :");
        id=input.nextInt();
        
    }
    
    void Output()
    {
        System.out.println("Name :"+name);
        System.out.println("ID   :"+id);
    }
}
class Output2
{
    public static void main(String[] args)
    {
        
    Oop_Constructor student1 ;
    student1 = new Oop_Constructor("Tanjid",200101470);
    student1.Output();
   // Oop_Constructor student2 = new Oop_Constructor();
   // student2.Output();
    
    
        
        
    }
}


