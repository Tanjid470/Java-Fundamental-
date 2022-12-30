
package basicjava;
import java.util.Scanner;


public class oop1 {
    String name;
    int id;  
}
class output
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        oop1 student1,student2;//object declare
        student1 =new oop1();//create object
        
        System.out.print("Enter the student name:");
        student1.name=input.next();
      //student1.name="Tanjid";
        student1.id=200101470;
        System.out.println(""+   student1.name);
        System.out.println(""+   student1.id);
        
        student2 =new oop1();//create object
        System.out.print("Enter the student name:");
        student2.name=input.next();
      //student2.name="Tanjid";
        student2.id=200101470;
        System.out.println(""+   student2.name);
        System.out.println(""+   student2.id);
        
        
    }
}
