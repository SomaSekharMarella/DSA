class Solution {
    public int lengthOfLastWord(String s) 
    {
        String word[]=s.split(" ");
        String ch=word[word.length-1];
        return ch.length();
    }
}
