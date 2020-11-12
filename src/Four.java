import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        int i;
        int p=4;
        for(i=0; i<a.length; i++) {
            a[i]=p;
            p+=3;
        }
        for (i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
