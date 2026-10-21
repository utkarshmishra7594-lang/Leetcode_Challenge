class Solution {
    public double largestTriangleArea(int[][] points) {
        double maxArea = 0.0;
        
        // Loop over all triplets of points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = triangleArea(points[i], points[j], points[k]);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        
        return maxArea;
    }
    
    // Helper function to calculate area using determinant formula
    private double triangleArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs(
            p1[0] * (p2[1] - p3[1]) +
            p2[0] * (p3[1] - p1[1]) +
            p3[0] * (p1[1] - p2[1])
        ) / 2.0;
    }
}
