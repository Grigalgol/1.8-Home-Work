import java.util.*;
public class DoppSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        for(i=0; i<a.length; i++) {
            a[i]= in.nextInt();
        }
        int maxx=a[0];
        for(i=1; i<a.length; i++) {
            if(a[i]>maxx) maxx=a[i];
        }
        System.out.println(maxx);
    }
}