
package basicjava;
import java.util.Scanner;

public class _2D_Array {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[][] number=new int[2][3];
        System.out.print("Enter the value :");
        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) 
            {
                number[i][j]=input.nextInt();   
            }
            System.out.println("");
            
        }
       /* number[0][0]=10;
        number[0][1]=20;
        number[0][2]=30;
        number[1][0]=40;
        number[1][1]=50;
        number[1][2]=60;*/
           for (int row = 0; row < 2; row++)
           {
               System.out.println("");
               for (int col = 0; col < 3; col++) 
               {
                   System.out.print(" "+number[row][col]);
                   
               }
            
           }System.out.println("");
    }
    
}
