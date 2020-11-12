import java.util.*;
public class DoppFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        int s=0;
        for(i=0; i<a.length; i++) {
            a[i]= in.nextInt();
        }
        for(i=0; i<a.length; i++) {
            if(a[i]>0) s++;
        }
        System.out.println(s);
    }
}