package String;

public class isAnaGram {
    static void is_Anagram(String s1, String s2){
        boolean isAanagram = false;
        boolean visited[] = new boolean[s2.length()];
        if(s1.length()==s2.length()){
            for(int i=0;i<s1.length();i++){
                char ch = s1.charAt(i);
                isAanagram = false;
                for(int j=0;j<s2.length();j++){
                    if(s2.charAt(j)==ch && !visited[j]){
                        visited[j]=true;
                        isAanagram = true;
                        break;
                    }
                }
                if(!isAanagram){
                    break;
                }
            }
        }
        if(isAanagram){
            System.out.println("anangram");
        }else{
            System.out.println("not anagram");
        }
    }
    public static void main(String[] args) {
      String s1 = "cat",s2="atc";
      is_Anagram(s1,s2);
    }
}
