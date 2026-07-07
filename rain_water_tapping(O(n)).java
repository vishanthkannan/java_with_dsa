class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int larr[] = new int[n];
        int rarr[] = new int[n];
        int drop = 0;

        larr[0] = height[0];
        rarr[n-1] = height[n-1];

        for(int i=1;i<n;i++){
            larr[i] = Math.max(height[i],larr[i-1]);
        }
        
        for(int j=n-2;j>=0;j--){
            rarr[j] =  Math.max(height[j], rarr[j+1]);
        }

        for(int i=0;i<n;i++){
            drop += Math.min(larr[i],rarr[i]) -height[i];
        }
        
        return drop;
    }
}
