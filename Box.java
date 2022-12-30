
package basicjava;

import static java.lang.Math.abs;
import java.util.Scanner;

public class Box {
    double height;//instance variable
    double width;
    int depth;
   
    Box(double x,double y,int z)//local variable
    {
        height=x;
        width=y;
        depth=z;
    }
    
    //Instance Variavle Hiding
    
    Box(double height,double width)
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
class Test3{
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       Box  n1,n3;
        n3 = new Box(20.11,30.33);
        n1 = new Box(10,10,10);
        n1.displayVol();
        Box  n2;
        n2 = new Box(20,10,40);
        n2.displayVol();
      
        
    }
    
}
