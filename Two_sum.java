class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int s=0;s<nums.length;s++){
            for(int i=s+1;i<nums.length;i++){
                if(nums[s] + nums[i] == target){
                return new int[]{s,i};
            }
        }
    }
        return new int[]{0};

}
}


// optimal solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target - nums[i];

            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
