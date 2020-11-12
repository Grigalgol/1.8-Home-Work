import java.util.*;
public class One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int a[] = new int [n];
        int i;
        int flag=0;
        for(i=0; i<a.length; i++) {
            a[i]=in.nextInt();
        }
        int b = in.nextInt();
        for(i=0; i<a.length; i++) {
            if(a[i]==b) {
                System.out.println(i+1);
                flag++;
                break;
            }
        }
        if(flag==0) System.out.println("NO");
    }
}
