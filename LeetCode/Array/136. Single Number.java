// Solution 1:
// Runtime 1 ms
// Beats 99.92%

// Memory 47.19 MB
// Beats 26.68%
  
public int singleNumber(int[] nums) {
    int res = 0;
    for(int i:nums){
        res^=i;
    }
    return res;
}

// Solution 2:
// Runtime 12ms
// Beats 21.95%

// Memory 47.18MB
// Beats 26.68%

public int singleNumber(int[] nums) {
    Set<Integer> st = new HashSet<>();
    for(int i:nums){
        if(st.contains(i)) st.remove(i);
        else st.add(i);
    }
    return st.iterator().next();
}
