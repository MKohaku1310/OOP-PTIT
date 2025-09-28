import java.util.Scanner;

public class J1010 {
    public static void check(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '8' || c == '9') {
                res.append('0');
            } else if (c == '1') {
                res.append('1');
            } else {
                System.out.println("INVALID");
                return;
            }
        }
        int idx = 0;
        while (idx < res.length() && res.charAt(idx) == '0') idx++;
        if (idx == res.length()) {
            System.out.println("INVALID");
        } else {
            System.out.println(res.substring(idx));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            check(s);
        }
        sc.close();
    }
}