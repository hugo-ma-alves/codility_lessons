// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int K, int[] C, int[] D) {
        // write your code in Java SE 8

        int numberPairs=0;
        //Clean drawer only
        for(int i=0;i<C.length;i++){
            for(int j=i+1;j<C.length;j++){
            if(C[i]!=-1 &&C[j]!=-1 && C[i]==C[j]){
                numberPairs++;
                C[j]=-1;C[i]=-1;
            }
            }
        }

        //Clean with dirty
        for(int i=0;i<C.length;i++){
            for(int j=0;j<D.length;j++){
                if(C[i]!=-1 && D[j]!=-1 && C[i]==D[j] && K>=1){
                    numberPairs++;
                    C[i]=-1;D[j]=-1;
                    K--;
                }
            }
        }

        //Dirty with dirty
        for(int i=0;i<D.length;i++){
            for(int j=i+1;j<D.length;j++){
                if(D[i]!=-1 && D[j]!=-1 && D[i]==D[j] && K>=2){
                    numberPairs++;
                    D[j]=-1;
                    K-=2;
                }
            }
        }

        return numberPairs;
    }
}
