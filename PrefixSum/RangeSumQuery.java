//Problem - RangeSum Query
//Pattern - Prefix
//Leetcode - 303. Range Sum Query - Immutable
class NumArray {
    int prefix[];
    public NumArray(int[] nums) {
        int n = nums.length,i;
        prefix = new int[n];
        prefix[0] = nums[0];
        for(i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefix[right];
        return prefix[right] - prefix[left-1];
    }
}
