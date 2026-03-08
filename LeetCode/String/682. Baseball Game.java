Solution1 : List O(n)
                   
Runtime 2ms
Beats 94.01%
Memory 43.39MB
Beats 90.65%

Approach: iterate each operation and store/remove elements based on the specified operation
  
public int calPoints(String[] operations) {
    // to store the points
    List<Integer> ls = new ArrayList<>();
    // total points
    int sum = 0;
    // current points to add or remove from total
    int sec = 0;
    // iterate operations
    for(String s : operations){
        char c = s.charAt(0);
        // add sum of last 2
        if(c=='+'){
            sec = ls.getLast() + ls.get( ls.size()-2 );
        }
        // add twice the last
        else if(c=='D') sec = ls.getLast()*2;
        // remove last
        else if(c=='C') {
            // decrement total
            sum -= ls.removeLast();
            continue;
        }
        // add the int score
        else sec = Integer.parseInt(s);
        // increment total
        sum += sec;
        ls.add(sec);
    }
    return sum;
}
                   
Solution2 : Stack O(n)

Runtime 2ms
Beats 94.01%
Memory 43.19MB
Beats 97.83%
  
Approach: iterate each operation and push/pop elements based on the specified operation

  
public int calPoints(String[] operations) {
    // to store the points
        Deque<Integer> ls = new ArrayDeque<>();
    // total points
    int sum = 0;
    // current points to add or remove from total
    int sec = 0;
    // iterate operations
    for(String s : operations){
        char c = s.charAt(0);
        // add sum of last 2
        if(c=='+'){
              sec = ls.pop();
              int temp = sec + ls.peek();
              ls.push(sec);
              sec = temp;
        }
        // add twice the last
        else if(c=='D') sec = ls.peek()*2;
        // remove last
        else if(c=='C') {
            // decrement total
            sum -= ls.pop();
            continue;
        }
        // add the int score
        else sec = Integer.parseInt(s);
        // increment total
        sum += sec;
        ls.add(sec);
    }
    return sum;
}
