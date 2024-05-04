class Solution {
    public int findMaxK(int[] nums) {
        int maxPositive = Integer.MIN_VALUE;
        
        for (int num : nums) {
            if (num > 0 && contains(nums, -num)) {
                maxPositive = Math.max(maxPositive, num);
            }
        }
        
        return maxPositive == Integer.MIN_VALUE ? -1 : maxPositive;
    }
    
    private boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
