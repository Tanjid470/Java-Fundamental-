
package basicjava;
import java.util.Arrays;


public class Sorting_Array {
 
    public static void main(String[] args) {
    
        int[] number = {10,-8,7,5,11};
        Arrays.sort(number);
        
    System.out.print("Ascending: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(" "+number[i]);    
        }
        
    System.out.print("\nDecending: ");
        for (int i = (number.length-1); i >= 0; i--) {
            System.out.print(" "+number[i]);  
        }
        System.out.println("\n");
        
//.....................String Same Or Not.....................................

        String s1="Tanjid Amran" ;
        String s2="tanjid Amran" ;
        
    //***** 
        boolean con=s1.contains("Tanjid");
        System.out.println("Contains: "+con);
        boolean con1=s1.isEmpty();
        System.out.println("Empty: "+con1);
    //*****
        
            if(s1.equals(s2))
            {
                 System.out.println("\nWihtout IgnoreCase: Equal"); 
            }
            else
                 System.out.println("\nWihtout IgnoreCase: Not Equal");
            if(s1.equalsIgnoreCase(s2))
            {
                 System.out.println("IgnoreCase: Equal"); 
            }
            else
                 System.out.println("IgnoreCase: Not Equal");
    
    //................String Concat...................
    String FirstName="Tanjid";
    String LastName=" Amran";
    
        String FullName=FirstName.concat(LastName);
        System.out.println("\n"+FullName);
    //................String UpperCase & LowerCase....
    
        System.out.println("\nUpper_Case: "+FullName.toUpperCase());
        System.out.println("Lower_Case: "+FullName.toLowerCase());

    //................String StartWith................
    
      boolean b=FullName.startsWith("t");
        System.out.println("\nFull_Name Start With (t): "+b);
      boolean c=FullName.endsWith("n");
        System.out.println("Full_Name End   With (n): "+c);
    
    //................String For_Each...............
    
    String[] name={"\nTanjid"," Hossain"," Amran\n"};
        for (String x : name) 
        {
            System.out.print(x); 
        }
        System.out.println("Length: "+name.length);
        
    //...............String anisul_Islam(69).......
    
    String country="Bangladesh is my country";
    char a=country.charAt(3);
        System.out.println("\n[3] Char____Variable_Name.charAt(int i)     : "+a);
    int value=country.codePointAt(4);
        System.out.println("[4] point___Variable_Name.codePointAt(int i): "+value);
    int pos=country.indexOf("n");
        System.out.println("First position of 'n': "+pos);
    int pos1=country.lastIndexOf("n");
        System.out.println("Last  position of 'n': "+pos1);
    }
    
}
