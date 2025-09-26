import java.util.Scanner;


public class J1017 {
    public static boolean check(String s){
        for(int i=0;i<s.length()-1;++i){
            if(Math.abs(s.charAt(i)-s.charAt(i+1))!=1) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            System.out.println(check(s)?"YES":"NO");
        }
        sc.close();
    }
    
}
