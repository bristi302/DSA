class Solution {
    public int maxSubArray(int[] arr) {
       int n = arr.length;
       int sum = 0 ;
       int max = Integer.MIN_VALUE;
       for(int i = 0; i<n ; i++){
        sum = Math.max(arr[i] , sum+arr[i]);
        max = Math.max(sum , max);
       }
       return max;
    }
}