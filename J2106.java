import java.util.Scanner;

public class J2106 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int res = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            cnt = a+b+c;
            if(cnt >=2){
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
