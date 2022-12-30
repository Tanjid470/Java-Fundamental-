
package basicjava;

import java.util.Scanner;


public class MathDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Abs:"+ Math.abs(-9));//Modulas
        System.out.println("Sqrt:"+ Math.sqrt(25));
        System.out.println("Power:"+ Math.pow(2,3));
        System.out.println("pai:"+ Math.PI);
        System.out.println("Log:"+ Math.log(13));
        System.out.println("Max:"+Math.max(5, 60));
        System.out.println("Mini:"+Math.min(5, 60));
        System.out.println("ceil:"+Math.ceil(5.6));//Up from the declared value
        System.out.println("floor:"+Math.floor(5.6));//Down from the declared value
        
        
    }
    
}
