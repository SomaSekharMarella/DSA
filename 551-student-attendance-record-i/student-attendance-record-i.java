class Solution {
    public boolean checkRecord(String s) 
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                count++;
            }
        }
        if(count>=2 || s.contains("LLL"))
        {
            return false;
        }
        return true;
    }
}