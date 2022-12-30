
package basicjava;

import java.util.Scanner;


public class Abstraction {
    
}

abstract class MobileUser
{
    abstract void sendMssg();
}
class Tanjid extends MobileUser{
   //override
    void sendMssg(){
        System.out.println("Tanjid");
    }
}
class Amran extends MobileUser{
    //override
    void sendMssg(){
        System.out.println("Amran");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        MobileUser ms;
        ms =new Tanjid();
        ms.sendMssg();
        ms =new Amran();
        ms.sendMssg();
        
        
    }
}
