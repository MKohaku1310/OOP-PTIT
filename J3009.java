import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J3009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String[] w1 = s1.split("\\s+");
            String[] w2 = s2.split("\\s+"); // tach ra thanh tung mang

            Set<String> st1 = new HashSet<>(Arrays.asList(w1));
            Set<String> st2 = new HashSet<>(Arrays.asList(w2)); // set chua tu cua s1 va s2

            st1.removeAll(st2);
            TreeSet<String> res = new TreeSet<>(st1);
            for(String w : res){
                System.out.print(w+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
