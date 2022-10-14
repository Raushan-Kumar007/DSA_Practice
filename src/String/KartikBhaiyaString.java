package String;

public class KartikBhaiyaString {
    public static void main(String[] args) {
        String str = "abababbaaaaabbb";
        int k = 3;
        int flipb = flipchar(str,k,'b');
        int flipa = flipchar(str,k,'a');
        System.out.print(Math.max(flipa,flipb));
    }

     static int flipchar(String str, int k, char a) {
        int start = 0;
        int end = 0;
        int ans = 0;
        int flip = 0;
        while (end<str.length()){
            if(str.charAt(end)==a){
                flip++;
            }
            while ( flip >= k && flip<=end) {
                if (str.charAt(start) == a) {
                    flip--;
                }
                start++;
            }
            ans = Math.max(end,end-start+1);
            end++;
        }
        return ans;
    }
}
