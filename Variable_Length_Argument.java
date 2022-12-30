
package basicjava;
import java.util.Scanner;


public class Variable_Length_Argument {
    
    void display(int ...num){
        
        int sum=0;
        for (int x:num) {
            sum=sum+x;  
        }
        System.out.println("Result:"+sum);
        
    }
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Variable_Length_Argument ob = new Variable_Length_Argument();
        ob.display(10,20);
        ob.display(30,40,50);
        ob.display(12,14,15,16);
        ob.display(1,2,3,4,5,6);
        
        
        
    }
    
}
