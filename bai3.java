import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap so a:");
        double a=Double.parseDouble(scanner.nextLine());
        System.out.println("moi nhap phep tinh:");
        String cal=scanner.nextLine();
        System.out.println("moi nhap so b:");
        double b=Double.parseDouble(scanner.nextLine());
        double kq;

        switch (cal){
            case "+":
              kq=a+b;
              System.out.printf("ket qua:%.1f",kq);
              break;
            case "-":
                kq=a-b;
                System.out.printf("ket qua:%.1f",kq
                );
                break;
            case "*":
                kq=a*b;
                System.out.printf("ket qua:%.1f",kq);
                break;
            case "/":
                kq=a/b;
                System.out.printf("ket qua:%.1f",kq);
                break;



        }
    }
}
