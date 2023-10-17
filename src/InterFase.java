import java.util.Scanner;

public class InterFase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(new Sum().getResalt(x,y));
        System.out.println(new Deduction().getResalt(x,y));
        System.out.println(new Reduct().getResalt(x,y));
        System.out.println(new Mult().getResalt(x,y));
    }
}
