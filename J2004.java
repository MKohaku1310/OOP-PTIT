import java.util.Scanner;


public class J2004 {
    public static boolean tes(int n, int[] a){
        for(int i=0;i<=n/2;++i){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = new int[100];
        while(t-->0){
            int n = sc.nextInt();
            for(int i=0;i<n;++i) a[i]=sc.nextInt();
            System.out.println(tes(n,a)?"YES":"NO");
        }
        sc.close();
    }
}
