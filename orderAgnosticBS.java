/**
 * orderAgnosticBS
 */
public class orderAgnosticBS {

    public static void main(String[] args) {
        int a[]= {-110,-2,-1,0,4,5,6,7,8,9,12,45,78,98,100};
            int k = binarySearch(a, 8);
            System.out.println(k);
        
    }
    static int binarySearch(int[] arr, int target){
        int high =arr.length - 1;
        int mid;
        int low = 0;
        boolean isAsc = arr[low]<arr[high];
        while(low<=high){
            mid =low + ((high-low)/2);
            if(arr[mid]==target)
                return mid;
            if(isAsc){
                if(target>arr[mid])
                    low=mid+1;
                else
                    high =mid-1;
            }
            else{
                if(target<arr[mid])
                    low=mid+1;
                else
                    high =mid-1;
            }
         
        }
        return -1;
    }
}