class Solution {

    private boolean checkPalindrome(String str){
        int x=0; 
        int y=str.length()-1;
        while (x<y){
            if (str.charAt(x) != str.charAt(y)){
                return false;
            }
            x++; y--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = s1.length()-1;

        while (i<j) {
            if (s1.charAt(i) != s1.charAt(j)){
                return checkPalindrome( s1.substring(0,i) + s1.substring(i+1) ) ||
                        checkPalindrome( s1.substring(0,j) + s1.substring(j+1) );
            }
            i++; j--;
        }
        return true;
    }
}