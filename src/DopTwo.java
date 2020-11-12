import java.util.Scanner;
public class DopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i,x;
        int a[] = new int [n+1];
        for(i=1; i<=a.length-2; i++) {
            a[i]=0;
        }
        for(i=1; i<=a.length-2; i++) {
            x= in.nextInt();
            a[x]=1;
        }
        for(i=1; i<=a.length-1; i++) {
            if(a[i]==0) {
                System.out.println(i);
                break;
            }
        }
    }
}