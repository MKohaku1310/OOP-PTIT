import java.util.Scanner;

public class J1018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next().trim();  // đọc số N dưới dạng chuỗi
            int sum = 0;
            boolean ok = true;
            
            for(int i = 0; i < s.length(); i++){
                int d = s.charAt(i) - '0';
                sum += d;
                if(i > 0){
                    int prev = s.charAt(i-1) - '0';
                    if(Math.abs(d - prev) != 2) ok = false;
                }
            }
            
            if(sum % 10 == 0 && ok){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
