public class rotatedArray {
    public static void main(String[] args) {
        int arr[] = {1,2};
        int k = pivot(arr);
        System.out.println(k);
    }
    public static int pivot(int[] a){
        int low =0;
        int high = a.length-1;
        int mid=0;
        while(low<high){
            mid = low+(high-low)/2;
            if(mid>low && a[mid-1]>a[mid]  )
                return mid-1;
            if(a[mid+1]<a[mid] && mid<high)
                return mid;
            if(a[low]>=a[mid])
                high= mid-1;
            else    low=mid+1;
        }
        return -1;
    }
}
