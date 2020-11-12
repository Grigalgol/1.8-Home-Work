import java.util.*;
public class Six {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        int i,j,k=0,kmax=0;
        int count=0, maxcount=0;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        for(i=0; i<a.length; i++) {
            count=0;
           for(j=0; j<a.length; j++) {
               if(a[i]==a[j]) count++;
           }
            k=a[i];
           if(count>maxcount) {
               maxcount=count;
               kmax=k;
           }
        }
            System.out.print(kmax);
    }
}