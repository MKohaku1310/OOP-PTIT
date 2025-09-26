import java.util.*;

public class J2006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++) set.add(sc.nextInt());
        for(int i=0;i<m;i++) set.add(sc.nextInt());
        boolean check = true;
        for(int x : set){
            if(!check) System.out.print(" ");
            System.out.print(x);
            check = false;
        }
        sc.close();
    }
}
