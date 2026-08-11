// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int unpaired=0;
        for(int n:arr)
        unpaired^=n;
        System.out.println(unpaired);
        }
}
//output
2 3 6 6 3 4 4 5 5
2
