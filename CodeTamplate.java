
package basicjava;

import java.util.Scanner;


public class CodeTamplate {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        String A;
        String B;
        A=Input.next();
        B=Input.next();
        int sum=A.length()+B.length();
        System.out.println(sum);


        if(A.compareTo(B)<=0)
        {
            System.out.println("No");            
        }
        else
        {
            System.out.println("Yes");            
        }
     String AA=A.substring(0, 1).toUpperCase() + A.substring(1);
     String BB=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(AA+" "+BB);        
    }
    
    
}
