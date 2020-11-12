import java.util.*;
public class DoppTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i<a.length; i++) {
            a[i]= in.nextInt();
        }
        for(i=0; i<a.length; i+=2) {
            System.out.print(a[i] + " ");
        }
    }
}
