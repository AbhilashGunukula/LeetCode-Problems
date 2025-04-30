class Pair{
    String first;
    int second;
    Pair(String first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair (beginWord,1));

        Set<String> st = new HashSet<String>(wordList);

        if(!st.contains(endWord)) return 0;
       
        st.remove(beginWord);
        int len = beginWord.length();

        while(!q.isEmpty()){
            String word = q.peek().first;
            int steps = q.peek().second;
            q.remove();

            if(word.equals(endWord) == true) return steps;

            for(int i = 0; i<len; i++){
                for(char ch ='a'; ch<='z'; ch++){
                    char[] charArray =  word.toCharArray();
                    charArray[i] = ch;
                    String newWord = new String(charArray);

                    if(st.contains(newWord)){
                        st.remove(newWord);
                        q.add(new Pair(newWord, steps+1));
                    }
                }
            }
        }

        return 0;
        
    }
}