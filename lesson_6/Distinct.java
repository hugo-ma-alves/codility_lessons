// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8

   Set<Integer> count = new HashSet<>();

    for(int i=0;i<A.length;i++){
        count.add(A[i]);
    }

    return count.size();

    }
}
