import java.util.Scanner;

public class J1025 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int x1 = sc.nextInt(), y1 = sc.nextInt();
      int x2 = sc.nextInt(), y2 = sc.nextInt();
      int x3 = sc.nextInt(), y3 = sc.nextInt();
      int x4 = sc.nextInt(), y4 = sc.nextInt();
      int xmin = Math.min(x1,x3);
      int ymin = Math.min(y1,y3);
      int xmax = Math.max(x2,x4);
      int ymax = Math.max(y2,y4);

      int cd = xmax-xmin;
      int cr = ymax-ymin;
      int dt = Math.max(cd,cr);
      System.out.println(dt*dt);
      sc.close();
    } 
}
