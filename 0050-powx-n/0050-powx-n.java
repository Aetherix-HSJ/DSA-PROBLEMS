class Solution {
    public double myPow(double x, int n) {
        long exp = n;
        if(n>0) return pow(x,exp);
        return 1.0/pow(x,-exp);
    }
    public double pow(double x, long n){
        if(n==0) return 1;
        double a = pow(x,n/2);
        if(n%2==0) return a*a;
        return a*a*x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna