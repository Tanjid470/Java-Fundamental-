
package basicjava;
//import java.util.Scanner;


public class Oop_Method_perameter {
    
 String name="Tanjid";
    int id; 
    //Creating Method
 void Input(String x,int y){
        name=x;
        id=y;

    }

    void Output()
    {
        System.out.println("Name :"+name);
        System.out.println("ID   :"+id);
    }
}
class Output3
{
    public static void main(String[] args)
    {
        
        Oop_Method_perameter student1,student2;//object declare
        student1 =new Oop_Method_perameter();//create object
        student2 =new Oop_Method_perameter();//create object
        student1.Input("Tanjid",200101470);
        student2.Input("Jawad",200101485);
        student1.Output();
        student2.Output();
     
        
        
        
        
    }
}

