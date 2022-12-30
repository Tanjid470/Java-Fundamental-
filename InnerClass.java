
package basicjava;

import java.util.Scanner;

class OuterClass{
    int y=5;
   
    
     static class InnerClass {
                       int x=10;
                       
                      }
                }
final class Output4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //OuterClass OC=new OuterClass();
        OuterClass.InnerClass IC=new OuterClass.InnerClass();
        System.out.println(""+IC.x);
        //System.out.println(""+OC.y);
        
    }
    
}