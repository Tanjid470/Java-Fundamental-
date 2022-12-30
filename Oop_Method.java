
package basicjava;

import java.util.Scanner;


public class Oop_Method extends Output{
    
String name;
    int id; 
    //Creating Method
    void Input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student name:");
        name=input.next();
        System.out.print("Enter the student id  :");
        id=input.nextInt();
    }
    
    void Output()
    {
        System.out.println("Name :"+name);
        System.out.println("ID   :"+id);
    }
}
class Output
{
    public static void main(String[] args)
    {
        
        Oop_Method student1,student2;//object declare
        student1 =new Oop_Method();//create object
        student2 =new Oop_Method();//create object
        student1.Input();
        //student2.Input();
        student1.Output();
        //student2.Output();
        
        
        
    }
}

