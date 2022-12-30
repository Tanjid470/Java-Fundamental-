
package basicjava;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D 
{
    public static void main(String[] args) 
    {
       
        Scanner input = new Scanner(System.in);
        
//..............................2D_Array   
        
        
        int[][]  arr=new int [2][3];
        for (int row = 0; row < 2; row++) 
        {
            for (int col = 0; col < 3; col++) {
      
                arr[row][col]= input.nextInt();
            } 
        }
        for (int row = 0; row < 2; row++) 
            
        {System.out.println("");
            for (int col = 0; col < 3; col++) {
      
                System.out.print(" "+arr[row][col]);
            } 
        }
  
//..........................Array Sorting
    
    
//    String[] arry={"Tanjid","Akash","Amran","Sabet"};
//
//    Arrays.sort(arry);
//        System.out.println("");
//        for (int i = 0; i < arry.length; i++)
//            //for (int i =3; i >=0; i--) ............For decending  sorting
//        
//        {
//            System.out.print(" " +arry[i]);
//            
//        }
        
        
        
        
        
    } 
}
