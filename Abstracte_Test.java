
package basicjava;

import java.util.Scanner;

public class Abstracte_Test { }

abstract class Shape{
    int a,b;
    Shape(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    abstract void shape();
    
}
class Rectrangle extends Shape{
    Rectrangle(int a,int b){
        super(a,b);
    }
   void shape(){
       int rslt=a*b;
       System.out.println("Area :"+rslt);
        
    }
    
}
class Triangle extends Rectrangle{ 
   Triangle(int a,int b){
        super(a,b);
    }
   void shape(){
       double rslt=0.5*a*b;
       System.out.println("Area :"+rslt);
        
    }
    
}
class Circle extends Triangle{  
    Circle(int a){
        super(a,a);
    }
   void shape(){
       double rslt=Math.PI*a*a;
       System.out.println("Area :"+rslt);
        
    }
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape s;
        s=new Rectrangle(5,6);
        s.shape();
        s=new Triangle(3,4);
        s.shape();
        s=new Circle(4);
        s.shape();
        
    }
    
}
