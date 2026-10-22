class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        int result[] = new int[2];
        int search;
        int i=1;
        for(int j=0; j<nums.length; j++){
            search = target-nums[j];
            hMap.put(search,j);
            if(hMap.containsKey(nums[i])){
                result[0] = hMap.get(nums[i]);
                result[1] = i;
                break;
            }
            else{
                i++;
            }
        }

        return result;
    }
}
