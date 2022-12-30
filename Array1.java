
package basicjava;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number;
        int sum = 0;
        double avg=0;
        number=new int[5];
        
       
        System.out.print("Enter the value : ");
        for (int i = 0; i <5; i++) 
        {
            //System.out.print("Enter the "+(i+1)+" value :");
           number[i]=input.nextInt(); 
           sum=sum+number[i];  
           avg =(double) sum/number.length;
        
        }
        System.out.println("Result :"+sum);
        System.out.println("average:"+avg);
 
        int len=number.length;
        System.out.println("length:"+len);
        
    } 
    
}
