class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n=nums.length;
        if(n%k!=0)
        {
            return false;
        }

        Arrays.sort(nums);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            int start = nums[i];

            if(hm.get(nums[i])==0)
            {
                continue;
            }

            for(int j=0;j<k;j++)
            {
                int temp = start + j;
                if(hm.getOrDefault(temp,0) > 0)
                {
                    hm.put(temp,hm.get(temp)-1);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}