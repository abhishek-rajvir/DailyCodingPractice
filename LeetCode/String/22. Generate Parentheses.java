Solution 1 : using recursion and stack

Runtime 143ms
Beats 5.71%

Memory 47.25 MB
Beats 5.47%

Approach => 

public List<String> generateParenthesis(int n) {
    List<String> ls = new ArrayList<>();
    gen("(",n*2,ls);
    return ls;
}

public void gen(String s,int n,List<String> ls){
    if(s.length()<n){
        gen(s+"(",n,ls);
        gen(s+")",n,ls);
    }
    else if(validParenthesis(s)) ls.add(s);
}

public boolean validParenthesis(String s){
    if(s.charAt(s.length()-1)=='(') return false;

    Deque<Character> st = new ArrayDeque<>();
    for(char c : s.toCharArray()){
        if(c == '(') st.push(c);
        else{
            if(!st.isEmpty()){
                char c2 = st.pop();
                System.out.println(c2);
                if(c2!=c) continue;
            }
            return false;
        }
    }
    return st.isEmpty();
}
