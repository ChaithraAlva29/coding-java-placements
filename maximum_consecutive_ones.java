// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=Arrays.stream(scan.nextLine().split(" "))
                 .mapToInt(Integer::parseInt).toArray();
        int maxCount=0,count=0;
        for(int num:arr){
            if(num==1){
                count++;
                if(count>maxCount)
                maxCount=count;
            }else
            count=0;
        }
        System.out.println(maxCount);
        
        }
}
//output
1 1 0 1 1 1 0 1
3
