class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

        for (int i : nums){
            hmap.put(i, hmap.getOrDefault(i, 0)+1);
        }
        
        int max = 0;
        int ans = 0;
        for (HashMap.Entry<Integer,Integer> entry : hmap.entrySet()){
            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}