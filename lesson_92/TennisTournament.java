// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int P, int C) {
        // write your code in Java SE 8

        int numberPairs=P/2;
        if(numberPairs==0 || C==0){
            return 0;
        }

        if(numberPairs<=C){
            return numberPairs;
        }else{
            return C;
        }
    }
}
