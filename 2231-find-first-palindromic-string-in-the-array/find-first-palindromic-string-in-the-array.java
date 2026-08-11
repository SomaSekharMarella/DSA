class Solution {
    public String firstPalindrome(String[] words) {
        String ans = "";
        for(int i=0;i<words.length;i++)
        {
            String str = words[i];
            String reversed = new StringBuilder(str).reverse().toString(); 
            if(str.equals(reversed))
            {

                ans = str;
                break;
            }
            
        }
        return ans;
    }
}