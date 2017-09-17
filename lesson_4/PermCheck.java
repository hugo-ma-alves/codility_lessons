// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        if(A.length==1 && A[0]==1){
            return 1;
        }else if(A.length==1 && A[0]!=1){
            return 0;
        }

        Arrays.sort(A);
        if(A[0]!=1){
            return 0;
        }
        for(int i=0;i<A.length;i++){
            if(i!=A.length-1 && A[i]!=A[i+1]-1){
                return 0;
            }
        }

        return 1;
    }
}
