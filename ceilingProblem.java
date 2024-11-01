public class ceilingProblem {
    public static void main(String[] args) {
        int arr[] = {0,12,45,78,98,100};
        int t = 40;
        int k = ceiling(arr, t);
        System.out.println(arr[k]);

    }
    static int ceiling(int[] a, int target){
        int low = 0;
        int high = a.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (a[mid] == target) {
                return mid;
            } else if (a[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}
