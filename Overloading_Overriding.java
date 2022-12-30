
package basicjava;


public class Overloading_Overriding {
    
    static void display(int n,int m)
    {
        System.out.println("1");  
    }
    static void display(double n,int m)
    {
        System.out.println("2");
    }
    static void display(int n,int m,int s)
    {
        System.out.println("3");
    }
    public static void main(String[] args) {
       display(10,20);
       display(1,2,3);
    }
    
}
