class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> results = new ArrayList<>();

        if(digits == null || digits.length() == 0) return results;

        HashMap<Character, String> store = new HashMap<>();

        store.put('2', "abc");
        store.put('3', "def");
        store.put('4', "ghi");
        store.put('5', "jkl");
        store.put('6', "mno");
        store.put('7', "pqrs");
        store.put('8', "tuv");
        store.put('9', "wxyz");

        backtrack(0, new StringBuilder(), store, results, digits);

        return results;
        
    }

    private void backtrack(int index, StringBuilder path, HashMap<Character, String> store, List<String> results, String digits  ){

        if(index == digits.length()){
            results.add(path.toString());
            return;
        }

        String possibleChars = store.get(digits.charAt(index));

        for(char ch : possibleChars.toCharArray()){
            path.append(ch);
            backtrack(index+1, path, store, results, digits);
            path.deleteCharAt(path.length()-1);
        }
    }
}