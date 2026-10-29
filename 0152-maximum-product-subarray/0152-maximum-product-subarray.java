class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0) return 0;
        int max = nums[0];
        int currentmax = nums[0];
        int currentmin = nums[0];
        for(int i=1 ; i< n; i++){
            int temp = currentmax;
            currentmax = Math.max(nums[i], Math.max(currentmax*nums[i] , currentmin*nums[i]));
            currentmin = Math.min(nums[i], Math.min(temp*nums[i] , currentmin*nums[i]));
            max = Math.max(max , currentmax);
        }
        return max;
        
    }
}