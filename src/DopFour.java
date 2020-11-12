import java.util.Scanner;
public class DopFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p=1;
        while (n>0) {
            p*=n;
            n--;
        }
        System.out.println(p);
    }
}