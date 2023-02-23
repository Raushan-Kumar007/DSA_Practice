package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// try with resources in 1.7 version of java thows we will use when we know which type of error will occur.
public class tryResources {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str = "";
            str = br.readLine();
        }
    }
}
