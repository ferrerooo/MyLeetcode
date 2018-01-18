class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        Integer[] arr = triangle.get(triangle.size()-1).toArray(new Integer[0]);
        
        for (int i=triangle.size()-2; i>=0; i--) {
            for (int j=0; j<=i; j++) {
                arr[j] = triangle.get(i).get(j) + Math.min(arr[j], arr[j+1]);
            }
        }
        
        return arr[0];
    }
}