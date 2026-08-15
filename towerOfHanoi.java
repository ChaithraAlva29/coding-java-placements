// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void towerOfHanoi(int  n,char source,char helper,char dest) {
        if(n==0)
        return;
        
        towerOfHanoi(n-1,source,dest,helper);
        System.out.println("Move disk"+n+"from"+source+"to"+dest);
        towerOfHanoi(n-1,helper,source,dest);
           
        }       
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int disks=sc.nextInt();
        towerOfHanoi(disks,'S','H','D');
       
    }
}
//output
