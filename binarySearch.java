class Main {

    public static void main(String[] args) {

        int[] arr = {2,5,7,19,21,24,27};

        System.out.println(binarySearch(arr,19));
    }
    
    private static int binarySearch(int[] arr,int key){
        
        int low = 0,high = arr.length - 1;
        
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            
            if(arr[mid] == key)
                return mid;
            
            if(arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        
        return -1;
    }
}
