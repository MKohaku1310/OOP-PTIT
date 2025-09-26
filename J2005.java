import java.util.*; 

public class J2005 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> seta = new TreeSet<>(); //Vừa sắp xêp và lưu các kí tự ko lặp
        Set<Integer> setb = new HashSet<>(); //xem có trùng ko 
        for(int i=0;i<n;i++) seta.add(sc.nextInt());
        for(int i=0;i<m;i++) setb.add(sc.nextInt());
        boolean check = true;
        for(int x : seta){
            if(setb.contains(x)){// nếu trong b có a thì
               if(!check) System.out.print(" "); 
             System.out.print(x);
             check = false;
        }
        
    }System.out.println();
        sc.close();
}
}
