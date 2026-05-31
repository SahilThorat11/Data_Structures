// P26 - Trie (Insert, Search, StartsWith)
class Program26 
{
    static class TrieNode 
    {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd;
    }

    static TrieNode root = new TrieNode();

    static void insert(String word) 
    {
        TrieNode cur = root;
        for(char c : word.toCharArray()) 
        {
            int idx = c - 'a';
            if(cur.children[idx] == null) 
            {
                cur.children[idx] = new TrieNode();
            }
            cur = cur.children[idx];
        }
        cur.isEnd = true;
    }

    static boolean search(String word) 
    {
        TrieNode cur = root;
        for(char c : word.toCharArray()) 
        {
            int idx = c - 'a';
            if(cur.children[idx] == null) 
            {
                return false;
            }
            cur = cur.children[idx];
        }
        return cur.isEnd;
    }

    static boolean startsWith(String prefix) 
    {
        TrieNode cur = root;
        for (char c : prefix.toCharArray()) 
        {
            int idx = c - 'a';
            if(cur.children[idx] == null) 
            {
                return false;
            }
            cur = cur.children[idx];
        }
        return true;
    }

    public static void main(String[] args) 
    {
        insert("apple"); insert("app"); insert("apt");

        System.out.println("search('apple')  = " + search("apple"));
        System.out.println("search('app')    = " + search("app"));
        System.out.println("search('ap')     = " + search("ap"));
        System.out.println("startsWith('ap') = " + startsWith("ap"));
        System.out.println("startsWith('b')  = " + startsWith("b"));
    }
}
