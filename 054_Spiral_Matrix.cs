public class Solution {
    public IList<int> SpiralOrder(int[,] matrix) {
        
        var res = new List<int>();
        var row = matrix.GetLength(0);
        var col = matrix.GetLength(1);
        var times = Math.Floor(Math.Min(row, col)/2.0);
        for (int i=0;i<times;i++) {
            for (int j=i;j<col-i-1;j++)
                res.Add(matrix[i,j]);
            for (int j=i;j<row-i-1;j++)
                res.Add(matrix[j, col-1-i]);
            for (int j=col-1-i; j>i;j--)
                res.Add(matrix[row-1-i, j]);
            for (int j=row-1-i; j>i; j--)
                res.Add(matrix[j, i]);
        }
        if (((int)Math.Min(row, col))%2 == 1) {
            int longSide = (int)Math.Max(row, col);
            int shortSide = (int)Math.Min(row, col);
            for (int j=shortSide/2; j<longSide-shortSide/2; j++) {
                if (row > col)
                    res.Add(matrix[j,shortSide/2]);
                else
                    res.Add(matrix[shortSide/2, j]);
            }
        }
        
        return res;
    }
}