class Trie {
    class PrefixTree {
        HashMap<Character, PrefixTree> hs = new HashMap<>();
        boolean isEnd = false;
    }
    PrefixTree pf;
    public Trie() {
        pf = new PrefixTree();
    }
    
    public void insert(String word) {
        PrefixTree cur = pf;

        for (char c: word.toCharArray()){
            if (!cur.hs.containsKey(c)) cur.hs.put(c, new PrefixTree());
            cur = cur.hs.get(c); 
        }
        cur.isEnd = true;
    }
    
    public boolean search(String word) {
        PrefixTree cur = pf;

        for (char c: word.toCharArray()){
            if (!cur.hs.containsKey(c)) return false;
            cur = cur.hs.get(c); 
        }
        return cur.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        PrefixTree cur = pf;

        for (char c: prefix.toCharArray()){
            if (!cur.hs.containsKey(c)) return false;
            cur = cur.hs.get(c); 
        }
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */