// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int cBelt[]=new int[n];
       for(int i=0;i<n;i++)
       cBelt[i]=scan.nextInt();
       for(int i=0;i<n;i++){
           if(cBelt[i]==0){
               for(int j=i;j<n-1;j++)
               cBelt[j]=cBelt[j+1];
               cBelt[n-1]=0;
           }
       }
       for(int ele:cBelt)
       System.out.println(ele +" ");
       
}
}
//output 8
4
5
0
6
0
7
0
8
4 
5 
6 
7 
8 
0 
0 
0 
