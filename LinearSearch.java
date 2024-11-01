import java.util.Scanner;

class linearSearch{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the item to be searched");
        int t = sc.nextInt();
        int k = search(a, t);
        System.out.println(k);
        

    }

    static int search(int arr[], int target){
        if(arr.length==0 ){
            return -1;
        }
            
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target){
                return i;
                }
         }
         return -1;
    }


}