import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int [n];
        int i;
        int flag=0;
        double s=0;
        double ar=0;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        for(i=0; i<a.length; i++) {
            if(a[i]%2!=0) {
                s+=a[i];
                flag++;
            }
        }
        if(flag==0) System.out.println("NO");
        else {
            ar=s/flag;
            System.out.format("%.2f",ar );
        }
    }
}
