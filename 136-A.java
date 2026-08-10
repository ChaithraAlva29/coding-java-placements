// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int friends[]=new int[n+1];
        for(int i=1;i<=n;i++)
        friends[scan.nextInt()]=i;
        for(int i=1;i<=n;i++)
        System.out.print(friends[i]+" ");
        
}
}
//output4 1 2 3 
