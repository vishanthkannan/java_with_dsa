class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int sl = needle.length();
        int nl = 0;
        int i=0;

        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(nl)){
                count++;
            if(count == sl){
                return i-(count-1);
            }
                nl++;
                i++;
            }
            else{
                nl = 0;
                i++;
                i -= count;
                count = 0;
            }
        }
        return -1;
    }
}
