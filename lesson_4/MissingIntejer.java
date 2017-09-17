// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.util.Arrays;


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        Arrays.sort(A);

        if(A.length==1 && A[0]==1){
            return 2;
        }else if(A.length==1 && A[0]!=1){
            return 1;
        }

        int[] positiveArrays= new int[A.length];
        int index=0;
        int lastFiledIndex=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>0 && A[i]!=positiveArrays[lastFiledIndex]){
                positiveArrays[index]=A[i];
                lastFiledIndex=index;
                index++;
            }
        }

        for(int i=index-1;i>0;i--){
            if(i==1 && positiveArrays[0]==1 && positiveArrays[1]!=2){
                return  2;
            }else if(i==1 && positiveArrays[0]!=1){
                return 1;
            }else if(i==1){
              return  positiveArrays[index-1]+1;
            }

            if(positiveArrays[i-1]!=positiveArrays[i]-1){
                return positiveArrays[i]-1;
            }
        }

        return 1;
    }


}
