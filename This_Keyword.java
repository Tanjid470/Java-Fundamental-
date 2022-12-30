
package basicjava;
import java.util.Scanner;

public class This_Keyword {
    String name;
    int a;
    String Dept;
    This_Keyword(String name,int a)
    {
        // This -- 101
        this.name=name;
        this.a=a;
    }
    void display()
    {
        System.out.println("Name:"+this.name);
        System.out.println("ID  :"+this.a);
    }
    This_Keyword(String name,int a,String Dept )
    {
        this(name,a);  // This -- 101
        this.Dept=Dept;
    }   
   void display1()
    {
        display();
        System.out.println("Dept :"+this.Dept);
  
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        This_Keyword  b =new This_Keyword ("Tanjid",2);
        b.display();
        This_Keyword  b1=new This_Keyword("Amran",3,"CSE");
        b1.display1();
    }
}
