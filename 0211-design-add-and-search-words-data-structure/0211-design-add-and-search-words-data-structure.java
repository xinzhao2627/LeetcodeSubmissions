class WordDictionary {
    class PrefixTree {
        HashMap<Character, PrefixTree> hs = new HashMap<>();
        boolean isEnd = false;

    }
    PrefixTree pf;
    public WordDictionary() {
        pf = new PrefixTree();
    }
    
    public void addWord(String word) {
        PrefixTree cur = pf;
        for (char c: word.toCharArray()){
            if (!cur.hs.containsKey(c)) cur.hs.put(c, new PrefixTree());
            cur = cur.hs.get(c);
        }
        cur.isEnd = true;
    }
    
    public boolean dfs(String word, int i, PrefixTree cur){
        if (i == word.length()) return cur.isEnd;
        char c = word.charAt(i);
        if (word.charAt(i) == '.'){
            int r = 0;
            for (PrefixTree nc: cur.hs.values()){
                r+= dfs(word, i+1, nc) ? 1 : 0;
                if (r > 0) break;
            }
            return (r == 0) ? false: true;

        }
        else if (cur.hs.containsKey(c)){
            return dfs(word, i+1, cur.hs.get(c));
        }
        return false;
    }

    public boolean search(String word) {
        PrefixTree cur = pf;
        
        return dfs(word, 0, cur);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */