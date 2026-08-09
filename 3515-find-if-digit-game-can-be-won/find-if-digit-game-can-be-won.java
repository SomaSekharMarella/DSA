class Solution {
    public boolean canAliceWin(int[] nums) 
    {
        int sin=0;
        int dou=0;

        for(int num:nums) 
        {
            if(num<10)
            {
                sin+=num;
            }
            else 
            {
                dou+=num;
            }
        }

        if(sin!=dou)
        {
            return true;
        }
        else return false;
    }
}