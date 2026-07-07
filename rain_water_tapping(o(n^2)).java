class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int larr[] = new int[n];
        int drop = 0;

        larr[0] = height[0];

        for(int i=1;i<n;i++){
            int right =0;
            int curr = height[i];
            larr[i] = Math.max(curr,larr[i-1]);

            for(int j=i;j<n;j++){
                right = Math.max(height[j],right);
            }

            drop += (Math.min(larr[i],right) - curr);

        }
        return drop;
    }
}
