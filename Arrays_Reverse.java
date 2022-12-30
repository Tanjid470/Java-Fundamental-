
package basicjava;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author user
 */
public class Arrays_Reverse {
    
    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 1, 8, 10 };
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int values : arr) {
            System.out.print(values + ", ");
            // 10, 8, 5, 2, 1,
        }
    }
    
    
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n=input.nextInt();
//        int[] a=new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i]=input.nextInt();
//        }
//        
//        Arrays.sort(a,Collections.reverseOrder());
//Arrays.sort(a);
//       int[] s=new int[n];
//        for (int i = 0,j=n-1; i < n; i++,j--) {
//            s[i]=a[j];
//        }
//           for (int x : a) {
//               System.out.print(x+" ");
//        }
//        System.out.println("");
//    }
    
    
}
