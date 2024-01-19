import java.util.Scanner;
public class bai7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("moi ban nhap nam:");
        int year=scanner.nextInt();
        System.out.print("moi ban nhap thang:");
        int month=scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("------------------------------");
                System.out.printf( "  thang |  %d   | co 31 ngay   ",month);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("------------------------------");
                System.out.printf( "  thang  |  %d    | co 30 ngay   ",month);
                break;
            case 2:
                if((year%4==0&&year%100!=0)||year%400==0){
                    System.out.println("------------------------------");
                    System.out.printf( "  thang  |  %d    | co 29 ngay   ",month);
                }
                else{
                    System.out.println("------------------------------");
                    System.out.printf( "  thang  |  %d    | co 28 ngay   ",month);
                }

        }

    }
}
