

package basicjava;
import java.util.Scanner;

public class Arithmetic_Operator {
    public static void main(String[] args) {
        
        
           
        Scanner input=new Scanner(System.in);
        int num1;
        System.out.print("Enter any number1:");
        num1=input.nextInt();
        int num2;
        System.out.print("Enter any number2:");
        num2=input.nextInt();
        
        int sum=num1+num2;
        float Divi=num1/num2;
        int divi_last=num1%num2;
           
        
           System.out.println(sum);
           System.out.println(Divi);
           System.out.println(divi_last);
         
           
                   }
    
}

