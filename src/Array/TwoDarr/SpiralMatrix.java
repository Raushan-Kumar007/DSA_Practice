package Array.TwoDarr;

public class SpiralMatrix {
    public static void PrintSpiral(int[][] arr) {

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int te = arr.length * arr[0].length;
        int c = 0;
        while (c < te) {
            for (int i = minc; i <= maxc && c < te; i++) {
                System.out.print(arr[minr][i] + " ");
                c++;

            }
            minr++;
            for (int i = minr; i <= maxr && c < te; i++) {
                System.out.print(arr[i][maxc] + " ");
                c++;

            }
            maxc--;
            for (int i = maxc; i >= minc && c < te; i--) {
                System.out.print(arr[maxr][i] + " ");
                c++;

            }
            maxr--;
            for (int i = maxr; i >= minr && c < te; i--) {
                System.out.print(arr[i][minc] + " ");
                c++;

            }
            minc++;

        }

    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,110},{5,6,7,8,112},{9,10,11,12,113}};
        PrintSpiral(arr);
    }
}
