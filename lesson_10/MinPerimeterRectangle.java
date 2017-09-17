// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8

        //Perimeter functiob B = 2(N/B+B)
        //smalles is where the derivative of  2*(N/B+B)==0
        double smallestPosibleB=Math.sqrt(N);
        int smallesBInt=(int)Math.floor(smallestPosibleB);
        //System.out.println("smallestPosibleB"+smallestPosibleB);
        //System.out.println("smallesBInt"+smallesBInt);
        //smallest perimeter using calcualted B
        int smallesPerimeter=2*(N/smallesBInt+smallesBInt);

        return smallesPerimeter;
    }
}
