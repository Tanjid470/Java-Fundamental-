
package basicjava;

import java.util.Scanner;


public class Inheriting_Private_Member {
    
private String name="Tanjid";
private    int id=200101470;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


  /* public void set(String name,int id){
       this.name=name;
       this.id=id;
       
   }
    
    public void display()
    {
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        
    }*/

}       // I N H E R I T A N C E 
 class inheritance3 extends Inheriting_Private_Member

{
    String name2="Hosen";
    
    public void display2()        
    {
       //display();
        getName();
        getId();
       System.out.println("Name2:"+name2);
    }
    
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        inheritance2 ob=new inheritance2();
        ob.display2();
        
    }
}