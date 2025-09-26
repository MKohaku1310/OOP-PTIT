import java.util.Scanner;


public class J1026 {
    public static boolean check(int n){
        int a = (int)Math.sqrt(n);
        return a*a == n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            System.out.println(check(n)?"YES":"NO");
        }
        sc.close();
    }
}
