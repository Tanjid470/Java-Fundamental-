
package basicjava;

import java.util.Scanner;


public class Variable_Type__Instance_Variable_hiding_by_this {
    
 double height;//instance variable
    double width;
    int depth;
    Variable_Type__Instance_Variable_hiding_by_this(double x,double y,int z)//local variable
    {
        height=x;
        width=y;
        depth=z;
    }
    
    //Instance Variavle Hiding
    
    Variable_Type__Instance_Variable_hiding_by_this(double height,double width)
    {
        this.height=height;
        this.width=width;
        System.out.println("this height:"+this.height);
        System.out.println("this width :"+width);
       
    }
    void displayVol()
    {
        double inti=height*width*depth;
        System.out.println("Inti  :"+inti);
        System.out.println("Height :"+height);
        System.out.println("Width  :"+width);
        System.out.println("Depth  :"+depth);
    }
    
}
class Test4{
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Variable_Type__Instance_Variable_hiding_by_this  n1,n3;
        n3 = new Variable_Type__Instance_Variable_hiding_by_this(20.11,30.33);
        n1 = new Variable_Type__Instance_Variable_hiding_by_this(10,10,10);
        n1.displayVol();
       Variable_Type__Instance_Variable_hiding_by_this n2;
        n2 = new Variable_Type__Instance_Variable_hiding_by_this(20,10,40);
        n2.displayVol();
        
    }
    
}

