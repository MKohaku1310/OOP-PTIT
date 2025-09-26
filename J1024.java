import java.util.Scanner;

public class J1024 {
    public static boolean check(String s){
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)>'3') return false;
        }
        return true;
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
