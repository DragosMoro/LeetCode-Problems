import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
       for(String token:tokens)
       {
           if(token.equals("+") || token.equals("-") || token.equals("/")  || token.equals("*"))
           {
               int a = st.pop();
               int b = st.pop();
               int res = calc(b,a,token.charAt(0));
               st.push(res);
           }
           else{
               st.push(Integer.parseInt(token));
           }
       }
       return st.pop(); 
    }

    public int calc(int a, int b, char sign)
    {
        if(sign == '+')
        {
            return a+b;
        }
        if(sign == '-')
        {
            return a-b;
        }
        if(sign == '/')
        {
            return a/b;
        }
        if(sign == '*')
        {
            return a*b;
        }
        return 0;
    }
}