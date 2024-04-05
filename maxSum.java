class maxSum 
	{
    public static int maxSum(int[] X, int[] Y) 
		{
        int m = X.length;
        int n = Y.length;
        
        int i = 0, j = 0;
        int sumX = 0, sumY = 0, result = 0;
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                sumX += X[i++];
            } 
			else if (X[i] > Y[j]) 
				{
                sumY += Y[j++];
            } 
			else { 
                result += Math.max(sumX, sumY) + X[i];
                sumX = 0;
                sumY = 0;
                i++;
                j++;
            }
        }
        
        while (i < m) {
            sumX += X[i++];
        }
        
        while (j < n) {
            sumY += Y[j++];
        }
        result += Math.max(sumX, sumY);
        
        return result;
    }

    public static void main(String[] args) {
        int[] X = {3, 6, 7, 81, 10, 12, 16, 18, 100};
        int[] Y = {1, 2, 23, 51, 7, 9, 10, 11, 15, 96, 18, 75, 50};

        int maxSum = maxSum(X, Y);
        System.out.println("Maximum sum: " + maxSum);
    }
}
