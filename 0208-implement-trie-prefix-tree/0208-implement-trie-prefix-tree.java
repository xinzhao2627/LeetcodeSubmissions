import java.util.*;
class pft {
    HashMap<Character, pft> branches =  new HashMap<>();
    boolean end = false;
}
class Trie {
    pft main;
    public Trie() {
        main = new pft();
    }
   
    public void insert(String word) {
        pft cur = main;

        for (char c : word.toCharArray()){
            if (!cur.branches.containsKey(c)){
                cur.branches.put(c, new pft());
            }
            cur = cur.branches.get(c);
        }
        cur.end = true;
        
    }
   
    public boolean search(String word) {
        pft cur = main;

        for (char c: word.toCharArray()){
            if (!cur.branches.containsKey(c)){
                return false;
            }
            cur = cur.branches.get(c);
        }

        return cur.end;

    }
   
    public boolean startsWith(String prefix) {
        pft cur = main;

        for (char c: prefix.toCharArray()){
            if (!cur.branches.containsKey(c)){
                return false;
            }
            cur = cur.branches.get(c);
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