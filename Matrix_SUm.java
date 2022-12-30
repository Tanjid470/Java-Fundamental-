
package basicjava;

import java.util.Scanner;


public class Matrix_SUm {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] number = new int[2][3];
        int[][] number2 = new int[2][3];
        int sum;
        
    System.out.print("Matrix 1:");
    
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {  
                number[i][j] = input.nextInt();   
            }
            System.out.println("");
        }
        
        
    System.out.println("Matrix 2:");
    
        for (int m = 0; m < 2; m++) {
            for (int k = 0; k < 3; k++) {
                number2[m][k]=input.nextInt();   
            }
            System.out.println("");
            
        }
       
        System.out.println("\n\t\t\tMatrix Addition:\n");
           for (int row = 0; row < 2; row++)
           {
               System.out.println("");
               for (int col = 0; col < 3; col++) 
               {
                   sum=number[row][col]+number2[row][col];
                   System.out.print(" "+sum);
                   
               }
            
           }System.out.println();
    }
    
}
