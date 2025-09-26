import java.util.Scanner;

public class J3006 {
    public static boolean check(String s){
        int n = s.length();
        for(int i=0;i<n/2;++i){
            char x = s.charAt(i);
            char y = s.charAt(n-i-1);
            if(x!=y||x%2==1||y%2==1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            System.out.println((check(s))? "YES":"NO");
        }sc.close();
    }
    
}
