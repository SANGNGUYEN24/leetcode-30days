class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]> result = new ArrayList<>();
        int m = land.length;
        int n = land[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 1) {
                    int bottomRow = i;
                    int rightCol = j;
                    
                    while (rightCol < n && land[i][rightCol] == 1) {
                        rightCol++;
                    }
                    while (bottomRow < m && land[bottomRow][j] == 1) {
                        bottomRow++;
                    }
                    result.add(new int[]{i, j, bottomRow - 1, rightCol - 1});
                    
                    markVisited(land, i, j, bottomRow - 1, rightCol - 1);
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
    
    private void markVisited(int[][] land, int topRow, int leftCol, int bottomRow, int rightCol) {
        for (int i = topRow; i <= bottomRow; i++) {
            for (int j = leftCol; j <= rightCol; j++) {
                land[i][j] = -1;
            }
        }
    }
}