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
            if (!cur.hs.containsKey(word.charAt(i))){
                cur.hs.put(word.charAt(i), new PrefixTree());
            }
            cur = cur.hs.get(word.charAt(i));
        }
        cur.isEnd = true;
    }
    public boolean dfs(String word, int i, PrefixTree cur){
        if (i == word.length()) {
            // System.out.println("yee" + " " + word);
            return cur.isEnd;
        }
        if (word.charAt(i) == '.'){
            boolean currentBoolean = false;
            for (PrefixTree t: cur.hs.values()){
                currentBoolean = dfs(word, i+1, t) || currentBoolean;
            }
            return currentBoolean;
        } else if (cur.hs.containsKey(word.charAt(i))){
            cur = cur.hs.get(word.charAt(i));
            return dfs(word, i+1, cur);
        } else {
            return false;
        }
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