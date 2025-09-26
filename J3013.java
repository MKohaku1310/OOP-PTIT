import java.math.BigInteger;
import java.util.Scanner;

public class J3013 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            int m1 = Math.max(a.toString().length(),b.toString().length());
            String ans = a.subtract(b).abs().toString();
            while(ans.length()<m1) ans = "0"+ans;
            System.out.println(ans);
        }
        sc.close();
    }
}
