public class Solution {
    public int[,] GenerateMatrix(int n) {
        
        var matrix = new int[n, n];
        var number = 1;
        var times = Math.Floor(n/2.0);
        
        for (int i=0;i<times;i++) {
            
            for (int j=i; j<n-1-i; j++)
                matrix[i, j] = number++;
            for (int j=i; j<n-1-i; j++)
                matrix[j, n-1-i] = number++;
            for (int j=n-1-i; j>i; j--)
                matrix[n-1-i, j] = number++;
            for (int j=n-1-i; j>i; j--)
                matrix[j, i] = number++;
        }
        
        if (n%2 == 1)
            matrix[n/2,n/2] = number;
        
        return matrix;
    }
}