
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int size = nums.length;

        HashSet hs = new HashSet();



        for(int i=0; i<size; i++){
            hs.add(nums[i]);
        }

        if(hs.size() != size){
            return true;
        }
        else{
            return false;
        }


    }
}