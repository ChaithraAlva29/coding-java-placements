// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                int count=num/2;
                for(int j=0;j<count;j++)
                System.out.print("1");
            }else{
                System.out.print("7");
                int c=num-3;
                for(int k=0;k<c;k++){
                    System.out.print("1");
                }
            }
        }
    }
}
//output2
3
7
4
11
