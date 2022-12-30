
package basicjava;

import java.util.Scanner;


public class ReverseDigits {
    
    public static void Armstrong(int rec){
        int hold =rec;
        int realvalue=rec;
        int sum2=0;
        while(hold !=0){
            int last=hold%10;
            int qb=last*last*last;
            sum2=sum2+qb;
            hold=hold/10; 
        }
       // System.out.println(""+sum2);
        if(sum2==realvalue){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value=input.nextInt();
        int sum=0;
        int temp=value;
        while(temp !=0){
           int hold=temp%10;
            sum=hold+(sum*10);
            temp=temp/10;   
        }
        System.out.println(sum); // Print reverse order
        if(sum==value)
            System.out.println("Palindrome"); 
        else
            System.out.println("Not Palindrome");
        
        System.out.println("Check Armstrong Number :");// 153 is armstrong
       
        int am=input.nextInt();
        Armstrong(am);
        System.exit(0);        
    }
    
}
