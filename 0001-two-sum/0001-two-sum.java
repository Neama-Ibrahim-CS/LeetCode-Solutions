class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int X= target-nums[i];
        if (map.containsKey(X))
        return new int[]{map.get(X),i};
        map.put(nums[i],i);
    }
    return new int []{};
    }
}