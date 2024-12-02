    class pfx {
        HashMap<Character, pfx> tree = new HashMap<>();
        boolean ending = false;
    }
class Trie {

    pfx ss;
    public Trie() {
        ss = new pfx();
    }
    
    public void insert(String word) {
        pfx cur = ss;

        for (char s : word.toCharArray()){
            if (!cur.tree.containsKey(s)){
                cur.tree.put(s, new pfx());
            }
            cur = cur.tree.get(s);
        }
        cur.ending = true;
        return;
    }
    
    public boolean search(String word) {
        pfx cur = ss;
        for (char c : word.toCharArray()){
            if (!cur.tree.containsKey(c)){
                return false;
            }
            cur = cur.tree.get(c);
        }
        return cur.ending;
    }
    
    public boolean startsWith(String prefix) {
        pfx cur = ss;

        for (char c: prefix.toCharArray()){
            if (!cur.tree.containsKey(c)){
                return false;
            }
            cur = cur.tree.get(c);
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