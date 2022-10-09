package String;

import java.util.Scanner;

public class SubString {
    static void printSubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1; j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "Sayeed";
        printSubString(str);
    }
}
