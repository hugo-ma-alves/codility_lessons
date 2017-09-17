// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A, int[] B) {
		// write your code in Java SE 8

        int aliveFishes=B.length;

		for (int i = 0; i < B.length; i++) {
			if (B[i] == 1) {
				for (int j = i + 1; j < B.length; j++) {
					if (B[j] == 0) {
						if (A[i] > A[j]) {
							B[j] = -1;
							aliveFishes--;
						} else if (A[i] < A[j]) {
							B[i] = -1;
							aliveFishes--;
							break;
						} else {
							break;
						}
					}else{
					 //fish in between
					 break;
					 }

				}
			}
		}

		return aliveFishes;
	}
}
