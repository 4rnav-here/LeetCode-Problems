public class reverseString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
    }
    public static String onlyChar(String st){
        String a="";
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)>=97 && st.charAt(i)<=122){
                a=a+st.charAt(i);
            }
        }
        return a;
    }
    public static boolean checkP(String st){
        int start =0;
        int end = st.length()-1;
        while(start<=end){
            if(st.charAt(start)==st.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }

        }
        return true;

    }
}
public static boolean  check()