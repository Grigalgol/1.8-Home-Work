import java.util.Scanner;
public class DoppOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n+1];
        int i;
        for (i=1; i<=a.length-1; i++) a[i] = i;
        int aa = in.nextInt(), b = in.nextInt(), c = in.nextInt(), d = in.nextInt();
        for(i=aa; i<=(aa+b)/2; i++) {
            int t =a[i];
            a[i]=a[b+aa-i];
            a[b+aa-i]=t;
        }
        for(i=c; i<=(c+d)/2; i++) {
            int l =a[i];
            a[i]=a[d+c-i];
            a[d+c-i]=l;
        }

        for(i=1; i<=n; i++) System.out.print(a[i] + " ");
    }
}