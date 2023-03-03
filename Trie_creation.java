public class Trie_creation {
    static class Node {
        Node child[]=new Node[26];
        boolean endOfWord=false;
        public Node(){
            for(int i=0;i<26;i++){
                child[i]=null;
            }
        }
    }
        public static Node root=new Node();
        public static void insert(String word){
            Node curr=root;
            for(int i=0;i<word.length();i++){
                int index=word.charAt(i)-'a';
                if(curr.child[index]==null){
                    curr.child[index]=new Node();
                }
                curr=curr.child[index];
            }
            curr.endOfWord=true;
        }
    
    public static boolean search(String word){
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(curr.child[index]==null){
                return false;
            }
            curr=curr.child[index];
        }
        return curr.endOfWord==true;
    }
    public static void main(String[] args) {
        String str[]={"the","a","there","their","any","thee"};
        for(int i=0;i<str.length;i++){
            insert(str[i]);
        }
        System.out.println(search("their"));
    }
    
}
