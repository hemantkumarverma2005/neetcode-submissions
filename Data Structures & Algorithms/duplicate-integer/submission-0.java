class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<n;i++){
            arr.put(nums[i],arr.getOrDefault(nums[i],0)+1);
        }
        int m=arr.size();
        for(Map.Entry<Integer,Integer> temp:arr.entrySet()){
            if(temp.getValue()>1)  return true;
        }
        return false;
    }
}