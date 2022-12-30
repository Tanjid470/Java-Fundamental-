package basicjava;
import java.util.Scanner;


public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=31;
        int b=16;
        int c=a|b;
        int d=a&b;
        System.out.println("A B and( & )  operation :"+d);
        System.out.println("A B Or ( | )  operation :"+c);

        System.out.println("\n");
    }
    
}

