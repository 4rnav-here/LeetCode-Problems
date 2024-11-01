import java.util.Arrays;

class bubbleSort{
    public static void main(String[] args) {
        int arr[] = {6,3,4,7,1,8,5,9,3,2,7,8};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        Integer n = new Integer(5);
        System.out.println(n.hashCode());
    }
}