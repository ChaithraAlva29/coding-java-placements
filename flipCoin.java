//Basic Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void flipCoins(String tossed,int n) {
        if(n<=0){
            System.out.println(tossed);
        return;
        }
        flipCoins(tossed+"H",n-1);
        flipCoins(tossed+'T',n-1);
    }     
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        flipCoins("",n);
       
    }
}
//output 2
Answer...
