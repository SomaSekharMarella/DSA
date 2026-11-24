
class Solution {
    public int maxLength(int[] nums) 
    {
        int max=0;

        for(int i=0;i<nums.length;i++) 
        {
            long product=1;
            int gcd=0;
            long lcm=1;

            for(int j=i;j<nums.length;j++) 
            {
                product*=nums[j];
                gcd=findGCD(gcd,nums[j]);

                lcm=(lcm*nums[j])/findGCD((int)lcm,nums[j]);

                if(product==gcd*lcm) 
                {
                    max=Math.max(max,j-i+1);
                }
            }
        }

        return max;
    }

    public int findGCD(int a, int b) 
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
