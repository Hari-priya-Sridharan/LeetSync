class Solution {
    public int[] getConcatenation(int[] nums) {
        //Iterate and add
        int n_size=nums.length;
        int an_size=2*n_size;
        int ans[]=new int[an_size];
        for(int i=0;i<n_size;i++){
            ans[i]=nums[i];
            ans[i+n_size]=nums[i];
        }
        return ans;
    }
}