class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int c = a;
        int d = b;
        while(b != 0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        
        int gcd = a;
       // int lcm = (c*d)/gcd;
        int lcm = (c / gcd) * d;
        
        return new int[]{lcm,gcd};
        
    }
}
