Solution 1 : O(n)
Runtime 0ms
Beats 100.00%
  
Memory 41.74MB
Beats 97.04%

/* APPROACH:- climbed steps are nothing but fibonacci series 
* hence for the resp value find the fibonacci no 
* fibonacci series = f[n-2] + f[n-1]
  0 -> 0 , 
  1 -> 1 , 
  2 -> 2 , 
  3 -> 3 , 
  4 -> 5 [f(3)+f(2)]
  5 -> 8 [f(4)+f(3)]
*/
public int climbStairs(int n) {
    // check if target is > 3
    if(n>3){
        // store n-1
        int f1 = 3;
        // store n-2
        int f2 = 2;
        // current no.
        int pos = 4;
        do{
            // swap n-1 with current fib[n-1 + n-2] 
            // &swap n-2 with n-1
            int prev = f1;
            f1 = f1+f2;
            f2 = prev;
        }
        // loop till the target
        while(pos++ < n);
        return f1;
    }
    // then the steps will be same
    return n;
}
