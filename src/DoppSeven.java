import java.util.*;
public class DoppSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i<a.length; i++) {
            a[i]= in.nextInt();
        }
        int s=1;
        for(i=1; i<a.length; i++) {
            if(a[i]!=a[i-1]) s++;
        }
        System.out.println(s);
    }
}