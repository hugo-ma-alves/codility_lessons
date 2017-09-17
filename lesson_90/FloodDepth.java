// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int[] maxwatherDepth=new int[A.length];

        int maxDepth=0;

        for(int i=0;i<A.length;i++){
                int depth=getDepth(A,i);
                //remove rock heigth
                depth=maxwatherDepth[i]=depth-A[i];
                if(depth>maxDepth){
                    maxDepth=depth;
                }
                //System.out.println("depth for pos "+i+"="+maxwatherDepth[i]);
        }
            return maxDepth;
    }

    private int getDepth(int[]A , int pos){

        if(pos==0 || pos ==A.length-1){
            return 0;
        }

        int rigthMax=0;
        for(int i=pos+1;i<A.length;i++){
            if(A[i]>=A[pos] && A[i]>rigthMax){
                rigthMax=A[i];
            }
        }

        int leftMax=0;
        for(int i=pos-1;i>=0;i--){
            if(A[i]>=A[pos] && A[i]>leftMax){
                leftMax=A[i];
            }
        }

        //System.out.println("For pos: "+pos+" rigthMax-"+rigthMax+" leftMax-"+leftMax);

        return Math.min(leftMax,rigthMax);
    }
}
