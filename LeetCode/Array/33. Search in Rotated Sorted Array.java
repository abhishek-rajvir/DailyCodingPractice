Solution 1 : W.C - O(n), Avg.C - O(n/2) , B.C - O(1)

Runtime 0ms
Beats 100.00%
Memory 43.92MB
Beats 44.29%

Approach => Linear Search the array from side closest to the target
  
public int search(int[] nums, int target) {
    // if 1st larger than target means target is closer to right end
    if(nums[0]>target){
        for(int i = nums.length-1; i>=0 ; i--){
            if(nums[i]==target) return i;
        }
    }
    // if 1st smaller than target means target is closer to left end
    else{
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]==target) return i;
        }
    }
    return -1;
}
