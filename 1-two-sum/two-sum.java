import java.util.*; 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            int rem=target - nums[i];
            if(m.containsKey(nums[i])){
                int[] ans={m.get(nums[i]),i};
                return ans;
            }
            else{
                m.put(rem,i);
            }
        }
        return null;
    }
}