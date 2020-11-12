import java.util.Scanner;
public class DopThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i, j;
        int p=1;
        int a[][] = new int[n][n];
        for (i = 0; i < a.length; i++)
            for (j=0; j<a.length; j++) {
                a[i][j]=p;
                p++;
            }
        for (i = 0; i < a.length; i++)
            for (j=0; j<a.length; j++)
                if(i==j) System.out.print(a[i][j] + " ");
    }
}