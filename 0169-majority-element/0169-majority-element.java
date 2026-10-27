class Solution {
    public int majorityElement(int[] nums) {
          int mejority = 0;
          int votes = 0;
          for (int i= 0; i<nums.length ; i++){
            if(votes ==0){
                mejority = nums[i];
            }
            if(nums[i] == mejority){
                votes++;
            }
            else 
                votes--;
          }

        return mejority;

    }
}