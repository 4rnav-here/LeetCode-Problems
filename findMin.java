public class findMin {
    public static void main(String[] args) {
        int arr[] = {18, 12, 7, 3, 14, 28};
        int m = min(arr);
        System.out.println(m);

    }
    static int min(int a[]){
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];

        }
        return min;
    }
}
