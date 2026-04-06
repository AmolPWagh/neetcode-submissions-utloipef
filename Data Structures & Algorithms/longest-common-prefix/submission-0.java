class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];
        
        for (String i : strs){
            int j=0;
            while (j < Math.min(i.length(),prefix.length())){
                if (prefix.charAt(j) != i.charAt(j)) break;
                j++;
            }
            prefix =prefix.substring(0,j);
        }
        return prefix;
    }
}