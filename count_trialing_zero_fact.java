// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
       int deno=5,trailZeroCount=0;
       while(deno<=n){
         trailZeroCount+=n/deno;
         deno*=5;
       }
       System.out.println(trailZeroCount);
        
        }
}
//output
5
1
