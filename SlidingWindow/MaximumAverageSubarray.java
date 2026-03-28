//Problem - MaxAverage of subarray with size k
//Pattern - SlidingWindow
//Leetcode - 643.Maximum Average Subarray l
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length,i,maxSum=0;
        double maxAverage;
        for(i=0;i<k;i++){
            maxSum+=nums[i];
        }
        maxAverage =(double) maxSum/k;
        for(i=k;i<n;i++){
            maxSum+=nums[i];
            maxSum-=nums[i-k];
            maxAverage = Math.max(maxAverage,(double)maxSum/k);
        }

        return maxAverage;


    }
}
