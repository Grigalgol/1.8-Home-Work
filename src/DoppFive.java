import java.util.*;
public class DoppFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        int s=0;
        for(i=0; i<a.length; i++) {
            a[i]= in.nextInt();
        }
        for(i=1; i<a.length; i++) {
            if(a[i]>a[i-1]) s++;
        }
        System.out.println(s);
    }
}