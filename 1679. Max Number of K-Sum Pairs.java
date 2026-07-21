class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer>  map = new HashMap<>();
        int count = 0;

        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<nums.length;i++){

            if(map.get(nums[i]) ==  0){
                continue;
            }

        int target = k-nums[i];

        if(nums[i]==target){
            if(map.get(nums[i]) >= 2){
                map.put(nums[i], map.getOrDefault(nums[i], nums[i])-2);
                count++;
            }
        }
        else{
            if(map.containsKey(target) && map.get(target) > 0){
                map.put(nums[i], map.get(nums[i])-1);
                map.put(target, map.get(target)-1);
                count++;
            }
        }
        }
        return count;
    }
}
