class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String word = "";
        int i;
        for ( i=0; i<Math.min(word1.length(), word2.length()); i++){
            word=word+word1.charAt(i);
            word=word+word2.charAt(i);
        }
        
        word = word + word1.substring(i) + word2.substring(i);
        
        return word;
    }
}