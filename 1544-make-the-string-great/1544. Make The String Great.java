class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if( (!stack.empty()) && (Character.toLowerCase(stack.peek()) == Character.toLowerCase(s.charAt(i))) && (stack.peek()-s.charAt(i) !=0))
            {
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty())
        {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    
        
    }
}