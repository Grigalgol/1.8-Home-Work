import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int [n];
        int i;
        int flag=0, s=0, k;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        for(i=0; i<a.length; i++) {
            if(a[i]%2==0) {
                s+=a[i];
                flag++;
            }
        }
        System.out.println(flag==0 ? "NO" : s);
    }
}