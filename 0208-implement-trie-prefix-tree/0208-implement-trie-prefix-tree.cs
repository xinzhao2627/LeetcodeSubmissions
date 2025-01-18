public class Trie {
    public class PrefixTree{
        public Dictionary<char, PrefixTree> tree = new Dictionary<char, PrefixTree>();
        public bool ending = false;
    }
    public PrefixTree pt;
    public Trie() {
        pt = new PrefixTree();
    }
    
    public void Insert(string word) {
        PrefixTree cur = pt;
        foreach (char c in word.ToCharArray()){
            if (!cur.tree.ContainsKey(c)) cur.tree[c] = new PrefixTree();
            cur = cur.tree[c];
        }
        cur.ending = true;
    }
    public bool Search(string word) {
        PrefixTree cur = pt;
        foreach (char c in word.ToCharArray()){
            if (!cur.tree.ContainsKey(c)) return false;
            cur = cur.tree[c];
        }
        return cur.ending;
    }
    
    public bool StartsWith(string prefix) {
        PrefixTree cur = pt;
        foreach (char c in prefix.ToCharArray()){
            if (!cur.tree.ContainsKey(c)) return false;
            cur = cur.tree[c];
        }

        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.Insert(word);
 * bool param_2 = obj.Search(word);
 * bool param_3 = obj.StartsWith(prefix);
 */