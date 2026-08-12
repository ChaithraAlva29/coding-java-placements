// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="abc";
        for(int i=0;i<str.length();i++){
        for(int j=i+1;j<=str.length();j++){
            String sub=str.substring(i,j);
            System.out.println(sub);
        }
        }
    }
}
//outputa
ab
abc
b
bc
c
