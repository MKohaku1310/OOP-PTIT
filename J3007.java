import java.util.Scanner;

public class J3007 {
    public static boolean check(String s){
        if(s.charAt(0)!='8'&&s.charAt(s.length()-1)!=8) return false;
        int cnt =0;
        for(int i=0;i<s.length()/2;++i){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
            cnt +=(s.charAt(i)-'0');
            if(i!=s.length()-1-i){
                cnt +=(s.charAt(s.length()-i-1)-'0');
            }
        }
        return cnt %10==0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
