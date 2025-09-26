import java.util.Scanner;

public class J2021 {
    static int n,k,cnt =0;
    static void Try(int i,int st,int[] res){
        if(i==k){
            cnt++;
            for(int j=0;j<k;j++){
                System.out.print(res[j]);
            }
            System.out.print(" ");
            return;
        }
        for(int u=st;u<=n-k+i+1;u++){
            res[i]=u;
            Try(i+1,u+1,res);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt(); k = sc.nextInt();
        int[] res = new int[k];
        Try(0,1,res);
        System.out.printf("\nTong cong co %d to hop",cnt);
        sc.close();
    }
}
