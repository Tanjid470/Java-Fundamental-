
package basicjava;

import java.util.Scanner;


public class Final_keyword {
    final String name=" Hossain ";
    final String name2;//Blank Final Variable 101
    static final String name5;// Static Blank Final Variable 102
    
     Final_keyword() //Blank Final Variable 101
            {
             name2="Tanjid";
             System.out.println("Name2  :"+name2);
            }
    
    static// Static Blank Final Variable 102
    {
    name5="Amran";
    }
    
    final void display(){
        System.out.println("Final_keyword Method");
    }
    
}
class N extends Final_keyword 
{
     void display2(){
          display();
          System.out.println("N Class Method");
    }
}
class D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Final_keyword  kkk = new Final_keyword();
        D d=new D();
        //double m=input.
        
      System.out.println(kkk.name);
        System.out.println(kkk.name5);
        
        N n=new N();
        n.display2();
        
    }
}