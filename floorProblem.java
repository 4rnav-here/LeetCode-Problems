public class floorProblem {
    public static void main(String[] args) {
        int arr[] = {2, 5, 8 ,13, 18, 19, 22, 25, 26, 33, 45, 58};
        int target = 15;
        int k = floor(arr, target);
        System.out.println(k);
    }
    static int floor(int[] a, int t){
        int low=0;
        int high = a.length -1;
        int mid =0;
        while (low<=high){
            mid = low + ((high-low)/2);
            if(a[mid]==t)
                return mid;
            if(a[mid]<t)
                high = mid-1;
            else    
                low = mid+1;
        }
        return high;
    }
}
