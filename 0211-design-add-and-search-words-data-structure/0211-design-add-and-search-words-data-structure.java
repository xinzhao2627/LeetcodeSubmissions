class WordDictionary {
    class PrefixTree{
        HashMap<Character, PrefixTree> hs = new HashMap<>();
        boolean isEnd = false;
    }
    PrefixTree pf;
    public WordDictionary() {
        pf = new PrefixTree();
    }
    
    public void addWord(String word) {
        PrefixTree cur = pf;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if (!cur.hs.containsKey(c)) cur.hs.put(c, new PrefixTree());

            cur = cur.hs.get(c);
        }
        cur.isEnd = true;
    }
    public boolean dfs(PrefixTree cur, String word, int i){
        if (i == word.length()) return cur.isEnd; 
        
        if (word.charAt(i) == '.'){
            for (PrefixTree c: cur.hs.values())
                if (dfs(c, word, i+1)) return true;
            return false;
        } else if (cur.hs.containsKey(word.charAt(i))){
            return dfs(cur.hs.get(word.charAt(i)), word, i+1);
        }

        return false;
        
    }
    
    public boolean search(String word) {
        PrefixTree cur = pf;
        return dfs(cur, word, 0);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */