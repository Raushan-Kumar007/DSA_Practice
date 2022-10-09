package String;

public class IsPalindrom {
    static boolean IsPalindrom(String str){
      int i =0;
      int j = str.length()-1;
      while (i<j){
          if(str.charAt(i)!=str.charAt(j)) {
              return false;
          }
          j--;
          i++;
      }
      return true;
    }
    public static void main(String[] args) {
      String str = "nitin";
        System.out.print(IsPalindrom(str));
    }
}
