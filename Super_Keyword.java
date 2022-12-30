
package basicjava;

import java.util.Scanner;

public class Super_Keyword {
    int x=10;   //Super Use to print Variable--101
    
}
class B extends Super_Keyword
       
{
     int x=5;
     String color;
     int a;
     B(){
         System.out.println("Defult B constructor");    
     }
     

     
                //Super Use to print Variable--101
     void display1(){
        System.out.println("Without Super keyword: "+x);
        System.out.println("With    Super keyword: "+super.x);
     }
     
                    //Super Method--102
     void display(){
         System.out.println("Super Method test");
     }
     
                     //Constructor--103
     
     B(String color,int a){
         this.color=color;
         this.a=a;    
     }
     public void print()//Constructor display--103.1
     {
         System.out.println("Color:"+color);
         System.out.println("Age  :"+a);
     }
   
}
class super_method extends B
{
    int m;
    
      void display() //Super Method--102
    {
        super.display();
        System.out.println("Sub Method");
    }
    
    
             // Super Constructor--103
    
    super_method(String color, int a,int m)
    {
        super(color, a);// for super keyword B constractor arive here
        this.m=m;
    }
              //Super Method
    public void  print(){//Super Constructor display--103.1
        super.print();
        System.out.println("Gear :"+m);
    }
             
    
  
    
    
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        B b=new B();
        b.display1();
        super_method sm=new super_method("Red",7,2);
        sm.display();
        sm.print();
    
        
    }
}
