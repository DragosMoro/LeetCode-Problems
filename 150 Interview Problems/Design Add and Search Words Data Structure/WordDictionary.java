class WordDictionary {
    Node root;
    public WordDictionary() {
        this.root = new Node('\0');
    }
    
    public void addWord(String word) {
        Node curr = root;
        for(char c: word.toCharArray())
        {
            if(curr.children[c-'a'] ==null)
            {
                curr.children[c-'a'] = new Node(c);
            }
            curr = curr.children[c-'a'];
        }
        curr.isFinal = true;
    }
    
    public boolean search(String word) {
        return searchHelper(word, 0, root);
        
    }
    private boolean searchHelper(String word, int index, Node curr)
    {
        for(int i=index;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(ch == '.')
            {
                for(Node temp: curr.children)
                {
                    if(temp!=null && searchHelper(word, i+1, temp))
                    {
                        return true;
                    }
                }
                return false;
            }
            if(curr.children[ch-'a'] == null)
            {
                return false;
            }
            curr = curr.children[ch-'a'];
        }
        return curr.isFinal;
    }

}
 class Node{
    public boolean isFinal;
    public char value;
    public Node[] children;

    Node(char val){
        this.isFinal = false;
        this.value = val;
        this.children = new Node[26];
    }
}
/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */