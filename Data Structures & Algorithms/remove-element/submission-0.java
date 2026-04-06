class Solution {
    public int removeElement(int[] nums, int val) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i : nums){
            if (i != val){
                arr.add(i);
            }
        }
        for (int i=0; i< arr.size(); i++){
            nums[i] = arr.get(i);
        }
        return arr.size();

    }
}