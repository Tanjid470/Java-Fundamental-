
package basicjava;

import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("How many number :");
        n=input.nextInt();
        int first=0,second=1,fibo;
        for (int i=3; i <=n;i++) {
            fibo=first+second;
            System.out.println("The "+i+" number is :" +fibo);
            first=second;
            second=fibo;
            
        }
        
    }
    
}
