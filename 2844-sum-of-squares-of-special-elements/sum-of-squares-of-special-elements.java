class Solution {
    public int sumOfSquares(int[] nums) {
        int count = nums.length;
        int answer = 0;
        for(int i=0;i<count;i++)
        {
            if(count%(i+1)==0)
            {
                answer = answer +nums[i]*nums[i];
            }
        }
        return answer;
        
    }
}