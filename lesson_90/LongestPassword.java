class Solution {
    public int solution(String S) {

		String[] words = S.split(" ");
		int biggestPass=-1;

		for (String word : words) {
			if(wordRulesOK(word) && word.length()>biggestPass ) {
				biggestPass=word.length();
			}
		}
		return biggestPass;
    }

  boolean wordRulesOK(String word) {
		int numberWords=0;
		int numberDigits=0;
		for (int i = 0; i < word.toCharArray().length; i++) {
			if((word.charAt(i)>='a' && word.charAt(i)<='z') ||
			    (word.charAt(i)>='A' && word.charAt(i)<='Z')) {
				numberWords++;
			}else if(word.charAt(i)>='0' && word.charAt(i)<='9') {
				numberDigits++;
			}else{
			    return false;
			}
		}
		return numberWords%2==0 && numberDigits%2!=0;
	}
}
