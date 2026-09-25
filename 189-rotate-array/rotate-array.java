class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];
        int a=0;
        k=k%nums.length;
        for(int i=nums.length-k ; i< nums.length;i++)
        {
            arr[a]=nums[i];
            a++;
        }
        for(int i=0;i<nums.length-k;i++)
        {
            arr[a]=nums[i];
            a++;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
    }
}