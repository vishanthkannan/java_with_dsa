class Solution {

    static void reverse(int[] nums, int b, int e){
        while(b<e){
            int temp = nums[b];
            nums[b] = nums[e];
            nums[e] = temp;
            b++;
            e--;
        }
    }

    public void rotate(int[] nums, int k) {
        if(nums.length<2){
            return;
        }
        k = k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

    }
}
