Solution 1: O(n+m) 
Runtime 2ms
Beats 94.42%
  
Memory 71.74MB
Beats 63.57%

Approach: first calculate the product of whole array without zero

public int[] productExceptSelf(int[] nums) {
    // hold product
    int max = 1;

    // edge case swap if only 2 elements
    if(nums.length == 2){
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        return nums;
    }

    // no of zeroes found
    int cnt = 0;
    for(int i : nums){
        if(i==0) cnt++;
        else max*=i;
    }

    // modify the array with new values
    for(int i=0 ; i<nums.length ; i++){
        // if zerocount > 1 means all values will be zero
        if(cnt>1) nums[i] = 0;
        // if cnt == 1 means except that all elements will be zero
        else if(cnt==1) 
            nums[i] = (nums[i]==0) ? max : 0;
        // else each element will be (product of all element)/(value of current element)
        else{
            nums[i] = max/nums[i];
        }
    }
  
    return nums;
}
