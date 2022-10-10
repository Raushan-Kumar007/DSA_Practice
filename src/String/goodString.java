package String;

public class goodString {
    static int good_String(String str){
        int ans = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)==true){
                int count = 0;
                while ( i<str.length() && isVowel(str.charAt(i))==true){
                    count++;
                    i++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
    static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "fmaieghf";
        System.out.print(good_String(str));

    }
}
