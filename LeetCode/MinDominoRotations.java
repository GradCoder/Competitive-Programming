class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        
        int aCount = check(A[0], A, B);
        int bCount = check(B[0], A, B);
        
        if (aCount == -1 || bCount == -1) return Math.max(bCount, aCount);
        
        return Math.min(aCount, bCount);
        
    }
    
    public int check(int element, int[] A, int[] B) {
        
        int aMinSwap = 0;
        int bMinSwap = 0;

        for (int idx = 0; idx < A.length; idx++) {
           if (A[idx] != element && B[idx] != element) return -1;
           if (B[idx] != element) bMinSwap++;
           if (A[idx] != element) aMinSwap++;

        }
        
        return Math.min(aMinSwap, bMinSwap);
    }
}
