class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int count = 0;
        int dupe = n;
        while(n>0)
        {
            int temp = n%10;
            product = product * temp;
            count+=temp;
            n=n/10;
        }
        return product - count;
        
    }
}