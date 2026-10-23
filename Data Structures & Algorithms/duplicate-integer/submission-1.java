class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hSet = new HashSet<>();

        for(int i=0; i<nums.length;i++){
            hSet.add(nums[i]);
        }

        if(nums.length == hSet.size()){
            return false;
        }
        return true;
    }
}