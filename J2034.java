import java.util.*;

public class J2034 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int amax = a[n-1];
        Set <Integer> st = new HashSet<>();
        for(int x : a) st.add(x);
        boolean check = false;
        for(int i=1;i<=amax;i++){
            if(!st.contains(i)){
                System.out.println(i);
                check = true;
            }
        }
        if(!check){
            System.out.println("Excellent!");
        }
        sc.close();
    }
}
