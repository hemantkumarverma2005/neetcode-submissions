class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length,ans[]={0,0};
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!arr.containsKey(nums[i]))
            arr.put(nums[i],i);
        }
        for(int i=0;i<n;i++){
            int temp=target-nums[i];
            if(arr.containsKey(temp)){
                ans[0]=arr.get(temp);
                ans[1]=i;
            }
        }
        return ans;
    }
}
