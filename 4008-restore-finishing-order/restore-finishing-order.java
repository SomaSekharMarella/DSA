class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans=new int[friends.length];
        int k=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<friends.length;i++)
        {
            hs.add(friends[i]);
        }
        for(int i=0;i<order.length;i++)
        {
            if(hs.contains(order[i]))
            {
                ans[k]=order[i];
                k++;
            }
        }
        return ans;
        
    }
}