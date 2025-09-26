import java.util.Scanner;

public class J1001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // Tạo đối tượng Scanner tên sc để đọc dữ liệu từ bàn phím (System.in).
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a<=0||b<=0) System.out.println(0);
        else{
            System.out.println(2*(a+b) + " " + a*b);
        }
        scanner.close();
    }
}
