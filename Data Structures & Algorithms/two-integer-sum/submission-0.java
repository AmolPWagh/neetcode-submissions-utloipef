class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hm = 
            new HashMap <Integer,Integer>();
        for (int i=0; i<nums.length; i++){
            int find = target - nums[i];
            if (hm.containsKey(nums[i])){
                return new int[] {hm.get(nums[i]), i};
            }
            hm.put(find,i);
        }
        return new int[] {-1,-1};
    }
}
