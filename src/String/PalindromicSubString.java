package String;

public class PalindromicSubString {
    static  boolean isPalendrom(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void SubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++) {
                String s = str.substring(i,j);
                if(isPalendrom(s)==true){
                    System.out.println(s);
                }
            }
        }
    }
    public static void main(String[] args) {
        String str = "nitin";
        SubString(str);
    }
}
