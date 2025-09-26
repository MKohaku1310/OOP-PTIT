import java.util.Scanner;

public class J1012 {
    public static void main(String[] arrgs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int cnt = 0;
        for(int i=1;i<=(Math.sqrt(n));++i){
            if(n%i==0){
                if(i%2==0) cnt++;
                int j = n/i;
                if(j!=i&&j%2==0) cnt++;
            }
        }
        System.out.println(cnt);
    }
    sc.close();
}
}
