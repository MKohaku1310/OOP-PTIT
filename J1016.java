import java.util.Scanner;


public class J1016 {
   static long[] f = new long[2000001];
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int sum=0;
    for(int i=0;i<s.length();++i){
        if(s.charAt(i)=='4'||s.charAt(i)=='7') sum++;
    }
    System.out.print((sum==4||sum==7)?"YES":"NO");
   sc.close();
   }
}
