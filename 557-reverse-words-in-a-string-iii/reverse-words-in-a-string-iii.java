class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        String answer="";

        for(int i=0;i<words.length;i++)
        {
            String w=words[i];

            for(int j=w.length()-1;j>=0;j--)
            {
                answer = answer + w.charAt(j);
            }

            if(i != words.length-1)
            {
                answer = answer + " ";
            }
        }

        return answer;
    }
}