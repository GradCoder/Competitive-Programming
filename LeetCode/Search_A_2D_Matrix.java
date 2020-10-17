class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length==0 || matrix[0].length==0)
            return false;
        
        int index = binarySearchRow(matrix,target,0, matrix.length-1);
        
        if(index== Integer.MIN_VALUE)
            return true;
        
        if(index-1!=-1)
        return binarySearch(matrix[index-1],target,0, matrix[index-1].length-1) == target ? true : false;
        
        return false;
    }
    
    public int binarySearch(int[] matrix,int target, int low, int high)
    {
      while(low <= high)
      {
          int mid= low + (high - low ) / 2;
          if(matrix[mid] == target)
              return target;
          if(matrix[mid] > target)
              return binarySearch(matrix, target,low, mid-1);
          if(matrix[mid] < target)
              return binarySearch(matrix, target,mid+1,high);
      }
        return -1;
    }
    
    public int binarySearchRow(int[][] matrix,int target, int low, int high)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/ 2;
            if(matrix[mid][0] == target)
                return Integer.MIN_VALUE;
            if(matrix[mid][0] > target)
                return binarySearchRow(matrix,target,low,mid -1);
            
            if(matrix[mid][0] < target)
                return binarySearchRow(matrix,target,mid+1, high);
        }
        return low;
    }
}
