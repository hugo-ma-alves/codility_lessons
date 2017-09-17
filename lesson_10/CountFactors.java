// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8


        int numberFactors=0;
        int m=1;

        while(m<Math.sqrt(N)){
            if(N%m==0){
                numberFactors+=2;
            }
            m++;
        }

        if (Math.pow(m, 2) == N) {
            numberFactors++;
        }

        return numberFactors;
    }
}
