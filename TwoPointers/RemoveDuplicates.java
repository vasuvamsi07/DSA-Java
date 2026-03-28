//Problem - Reomve Duplicates from Sorted Array
//Pattern - TwoPointer
//LeetCode - 26. Remove Duplicates From Sorted Array
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,j;
        for(j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}
