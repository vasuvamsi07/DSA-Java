//Pattern - BinarySearch
//Leetcode - 34. Find First And Last Position Of Element In sorted Array
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int fPos = firstPosition(nums,target);
        int lPos = lastPosition(nums, target);
        return new int[]{fPos,lPos};
    }

    public int firstPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1,ans=-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target) {
                ans = mid;
                right = mid - 1;
            }
            else if(nums[mid]>target) {
                right = mid -1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public int lastPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1,ans=-1;
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target) {
                left = mid + 1;
                ans = mid;
            }
            else if(nums[mid]>target) {
                right = mid -1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
