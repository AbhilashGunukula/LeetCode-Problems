class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        if(dead.contains("0000")) return -1;

        queue.offer("0000");
        visited.add("0000");

        int steps = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                String curr = queue.poll();
                if(curr.equals(target)) return steps;

                for(String st : getNeighbours(curr)){

                    if(!visited.contains(st) && !dead.contains(st)){
                        queue.offer(st);
                        visited.add(st);
                    }

                }

            }

            steps++;
        }

        return -1;

        
    }

    private ArrayList<String> getNeighbours(String code){
        ArrayList<String> store = new ArrayList<>();
        char[] chars = code.toCharArray();

        for(int i = 0; i<4; i++){
            char old = chars[i];

            chars[i] = old == '0' ? '9' : (char) (old-1);
            store.add(new String(chars));

            chars[i] = old == '9' ? '0' : (char) (old+1); 
            store.add(new String(chars));

            chars[i] = old;
        }

        return store;
    }
}