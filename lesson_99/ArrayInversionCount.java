// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        long count=0;
        for(int p=0;p<A.length;p++){
            for(int q=p+1;q<A.length;q++){
                if(A[q]<A[p]){
                    count++;
                }
            }
        }

        if(count>1000000000){
            return -1;
        }
        return (int)count;
    }
}
