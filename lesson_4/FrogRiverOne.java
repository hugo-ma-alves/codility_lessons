// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8


        int[] frogPos= new int[X];
        for(int i=0;i<frogPos.length;i++){
            frogPos[i]=-1;
        }

        for(int i=0;i<A.length;i++){
            if(frogPos[A[i]-1]==-1){
                frogPos[A[i]-1]=i;
            }
        }

        int biggest=0;
        for(int i=0;i<frogPos.length;i++){
            if(frogPos[i]==-1){
                return -1;
            }else if(frogPos[i]>biggest){
                biggest=frogPos[i];
            }
        }

        return biggest;
    }
}
