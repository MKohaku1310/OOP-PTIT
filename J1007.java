import java.util.Scanner;


public class J1007 {
    static long[] a = new long[100];
    public static boolean fibo(long n){
        for(int i=0;i<=92;++i){
            if(a[i]==n) return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        a[0]=0;
        a[1]=1;
        for(int i=2;i<=92;++i){
        a[i]=a[i-2]+a[i-1];
        }
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            System.out.println(fibo(n)?"YES":"NO");
        }
        sc.close();
    }
}
