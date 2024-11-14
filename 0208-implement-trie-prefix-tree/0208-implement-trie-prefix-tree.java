import java.util.*;
class Trie {
    class pfTree {
        HashMap<Character, pfTree> children = new HashMap<>();
        boolean last = false;
    }
    pfTree root;
    public Trie() {
       root = new pfTree();
    }
   
    public void insert(String word) {
        pfTree cur = root;
        for (char c : word.toCharArray()){
            if (cur.children.get(c) == null){
                cur.children.put(c, new pfTree());
            }
            cur = cur.children.get(c);
        }
        cur.last = true;
    }
   
    public boolean search(String word) {
        pfTree cur = root;
        for (char c: word.toCharArray()){
            if (cur.children.get(c) == null) return false;
            cur = cur.children.get(c);
        }
        return cur.last;
    }
   
    public boolean startsWith(String prefix) {
        pfTree cur = root;
        for (char c: prefix.toCharArray()){
            if (cur.children.get(c) == null) return false;
            cur = cur.children.get(c);
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