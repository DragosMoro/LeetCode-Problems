import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails)
        {
            String[] parts = email.split("@");
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<parts[0].length();j++)
            {
                if(parts[0].charAt(j) == '+')
                {
                    break;
                }
                if(parts[0].charAt(j) != '.')
                {
                    sb.append(parts[0].charAt(j));
                }
            }
            sb.append("@").append(parts[1]);
            if(!set.contains(sb.toString()))
            {
                set.add(sb.toString());
            }
        }
        return set.size();
    }
}