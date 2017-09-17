// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        long numberPairs=0;
        for(int p=0;p<A.length;p++){
            if(A[p]==0){
               for(int q=p+1;q<A.length;q++){
                if(A[p]!=A[q] ){
                    numberPairs++;
                    //System.out.println("Pair("+p+","+q+")");
                }
                }
            }

        }

        if(numberPairs>1000000000){
            return -1;
        }
        return (int)numberPairs;
    }
}
