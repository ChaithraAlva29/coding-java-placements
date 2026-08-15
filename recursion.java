import java.util.*;
class Main {
    public static void printName(String name,int n) {
        if(n<0)
        return;
        else{
            printName(name,n-1);
            char ch=name.charAt(n);
            System.out.println(ch);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        printName(s,n-1);       
    }
}
