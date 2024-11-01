public class binarysearch {
    public static void main(String[] args) {
            int a[]= {5,7};
            int k = binarySearch(a, 7);
            System.out.println(k);
        }

    static int binarySearch(int[] arr, int target){
        int high =arr.length - 1;
        int mid;
        int low = 0;
        while(low<=high){
            mid =low + ((high-low)/2);
            if(arr[mid]==target)
                return mid;
            if(target>arr[mid])
                low=mid+1;
            else{
                high =mid-1;
            }
         }
         return -1;
    }
}

