import java.util.Scanner;

public class J1022 {
    static long[] fib = new long[94];
    static void sinh(){
        fib[1]=fib[2]=1;
        for(int i=3;i<=93;i++){
            fib[i]=fib[i-2]+fib[i-1];
        }
    }
    static char check(int n,long k){
        while(n>2){
            if(k<=fib[n-2]){
                n = n-2;
            } else {
                k = k-fib[n-2];
                n = n-1;
            }
        }
        return n==1 ? '0' : '1';
    }
    public static void main(String[] args){
        sinh();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt(); 
            long k = sc.nextLong();
            System.out.println(check(n,k));
        }
        sc.close();
    }
}
