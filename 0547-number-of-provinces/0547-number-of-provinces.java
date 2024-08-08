class Solution {
    public int findCircleNum(int[][] isConnected) {

        boolean [] visited = new boolean[isConnected.length];
        int counter =0;
        for(int i= 0; i<isConnected.length; i++){
            if(!visited[i]){
                dfs(i, visited, isConnected);
                counter++;
            }
        }

        return counter;
        
    }
    private void dfs(int j,boolean[] visited,int[][] grid){
        visited[j] = true;
        for(int i=0; i<grid[j].length; i++){
            if(!visited[i] && grid[j][i]==1){
                dfs(i,visited, grid);
            }
        }
    }

}