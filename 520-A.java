// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String s=scan.next();
        HashSet<Character>set=new HashSet<>();
        for(Character ch:s.toUpperCase().toCharArray())
        set.add(ch);
        if(set.size()>=26)
        System.out.println("YES");
        else
        System.out.println("No");
        }
}
//output
35
TheQuickBrownFoxJumpsOverTheLazyDog
YES
