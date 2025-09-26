import java.util.Scanner;


public class J1009 {
    static long[] a = new long[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tmp=1,sum=0;
        for(int i=1;i<=n;++i){
            tmp*=i;
            sum+=tmp;
        }
        System.out.println(sum);
        sc.close();
    }
}
