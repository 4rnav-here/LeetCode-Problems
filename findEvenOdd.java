public class findEvenOdd{
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        int even = 0;
        for(int i: nums){
            if(digitCount(i)%2==0)
                even++;
        }
        System.out.println(even);
    }
    static int digitCount(int n){
        int d = 0;
        while (n!=0){
            d++;
            n=n/10;
        }
        return d;
    }
}