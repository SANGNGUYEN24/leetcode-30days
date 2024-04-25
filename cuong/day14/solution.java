class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
       if (n == 1) return Collections.singletonList(0);
       
       List<Set<Integer>> adjList = new ArrayList<>(n);
       for (int i = 0; i < n; i++) {
           adjList.add(new HashSet<>());
       }
       for (int[] edge : edges) {
           int u = edge[0];
           int v = edge[1];
           adjList.get(u).add(v);
           adjList.get(v).add(u);
       }
       
       Queue<Integer> leaves = new LinkedList<>();
       for (int i = 0; i < n; i++) {
           if (adjList.get(i).size() == 1) {
               leaves.offer(i);
           }
       }
       
       while (n > 2) {
           int size = leaves.size();
           n -= size;
           for (int i = 0; i < size; i++) {
               int leaf = leaves.poll();
               int neighbor = adjList.get(leaf).iterator().next();
               adjList.get(neighbor).remove(leaf);
               if (adjList.get(neighbor).size() == 1) {
                   leaves.offer(neighbor);
               }
           }
       }
       List<Integer> result = new ArrayList<>(leaves);
       return result;
   }
}