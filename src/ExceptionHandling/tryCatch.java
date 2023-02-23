package ExceptionHandling;
// Thowable is the main class which will handling the exception.
// there are two type Exception 1. Checked : it will happen at compileTime e.g: IOException , SQLException
// 2.Uncheck exception : it will happen at the runtime.
// finally block will be optional, if we add finally block it'll always print either exception has occured or not
public class tryCatch {
    static void divide(int i, int j){
        try {
            int res = i/j;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.print("Bye");
        }
    }
    public static void main(String[] args) {
        divide(1,0);
    }
}
