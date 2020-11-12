import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        int i,t;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        for(i=0; i<a.length/2; i++) {
            t=a[i];
            a[i]=a[n-1-i];
            a[n-1-i]=t;

        }
        for (i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}