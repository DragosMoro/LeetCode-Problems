import java.util.Objects;

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int pos = 0;
//         if(s.length()>t.length())
//         {
//             return false;
//         }
//         if(s.length() == 0)
//         {
//             return true;
//         }
//         for(int i=0;i<t.length();i++)
//         {
//             if(Objects.equals(t.charAt(i), s.charAt(pos)))
//             {
//                 pos++;
//             }
//             if(Objects.equals(pos, s.length()))
//             {
//                 return true;
//             }
//         }
//         return false;
//     }
// }

//better time
class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos = 0;
        if(s.length() == 0)
        {
            return true;
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i) == s.charAt(pos))
            {
                pos++;
            }
            if(pos == s.length())
            {
                return true;
            }
        }
        return false;
    }
}