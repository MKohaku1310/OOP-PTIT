import java.util.Scanner;

public class J3004 {
    public static String chuyenHoa(String s){
    s = s.trim().toLowerCase(); //loai bo khoang trang dau cuoi
    String a[] = s.split("\\s+"); // tach cac tu, bo khoang trang thua
    StringBuilder sb = new StringBuilder();
    for(String w : a){
        if(w.length()>0){
            sb.append(Character.toUpperCase(w.charAt(0  )));
            if(w.length()>1){
                sb.append(w.substring(1));
            }
            sb.append(" ");
        }
    }
    return sb.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(chuyenHoa(s));
        }
        sc.close();
    }
}
