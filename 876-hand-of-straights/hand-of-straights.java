class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n %groupSize!=0)
        {
            return false;
        }

        Arrays.sort(hand);

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }

        for(int i=0;i<n;i++)
        {
            int start = hand[i];
            if(hm.get(hand[i])==0)
            {
                continue;
            }

            for(int j=0;j<groupSize;j++)
            {
                int temp = start+j;
                if(hm.getOrDefault(temp,0)>0)
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