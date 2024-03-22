class Solution {
    public String reverseWords(String s) {
        List<String> stringList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(sb.length()>0)
                {
                    stringList.add(sb.toString());
                    sb = new StringBuilder();
                }
                else{
                    continue;
                }
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        if(sb.length()>0)
        {
            stringList.add(sb.toString());
            sb = new StringBuilder();
        }
        for(int i=stringList.size()-1;i>0;i--)
        {
            sb.append(stringList.get(i)+ " ");
        }
        sb.append(stringList.get(0));
        return sb.toString();
    }
}