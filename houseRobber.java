class Solution {
    static int maxTheft(int[]nums,int index){
        if(index>=nums.length)
        return 0;
        int rob=nums[index]+maxTheft(nums,index+2);
        int skip=maxTheft(nums,index+1);
        return Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        return maxTheft(nums,0);
        
    }
}
