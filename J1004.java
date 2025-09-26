import java.util.Scanner;


public class J1004 {
    public static boolean nto(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
            return false;
        }
    }
    return n>1;
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n = sc.nextInt();
        System.out.println(nto(n)?"YES":"NO");
    }
    sc.close();
}
}