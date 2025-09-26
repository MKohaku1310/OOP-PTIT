import java.util.Scanner;

public class J1014 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long max1 = -1;
            for(long i=2;i*i<=n;i++){
                while(n%i==0){
                    max1 = i;
                    n/=i;
                }
            }
            if(n>1) max1=n;
            System.out.println(max1);
        }
        sc.close();
    }
}
