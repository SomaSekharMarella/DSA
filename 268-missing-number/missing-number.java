class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len*(len+1)/2;
        int actSum=0;
        for(int i=0;i<len;i++)
        {
            actSum+=nums[i];
        }
        return sum-actSum;
    }
}
