class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length, n = B.length;

        int count = 0;
        int x = 0, y = 0;
        int i = 0, j = 0;

        while(count < ((m + n) / 2 + 1)){
            x = y;

            if(i < m && j < n){
                if(A[i] < B[j]){
                    y = A[i];
                    i++;
                }else{
                    y = B[j];
                    j++;
                }
            }else if(i < m){
                y = A[i];
                i++;
            }else{
                y = B[j];
                j++;
            }

            count++;
        }

        if(((m + n) % 2) == 0){
            return (x + y) / 2.0;
        }else{
            return (double) y;
        }
    }
}
