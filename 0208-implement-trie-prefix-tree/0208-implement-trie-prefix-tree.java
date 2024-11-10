import java.util.*;
class Trie {
    public class prefixNode {
        HashMap<Character, prefixNode> children = new HashMap<>();
        boolean endLetter = false; 
    }
    prefixNode root;
    public Trie() {
        root = new prefixNode();
    }
    
    public void insert(String word) {
        prefixNode curr = root;
        for (char c : word.toCharArray()){
            if (curr.children.get(c) == null) 
                curr.children.put(c, new prefixNode());

            curr = curr.children.get(c);
        }
        curr.endLetter = true;
    }
    
    public boolean search(String word) {
        prefixNode curr = root;
        for (char c : word.toCharArray()){
            if (curr.children.get(c) == null) return false;
            curr = curr.children.get(c);
        }
        return curr.endLetter;
    }
    
    public boolean startsWith(String prefix) {
        prefixNode curr = root;

        for (char c : prefix.toCharArray()){
            if (curr.children.get(c) == null) return false;
            curr = curr.children.get(c);
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