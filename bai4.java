import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mơi ban nhap b:");
        int b=scanner.nextInt();
        if(b%3==0&&b%5==0){
            System.out.printf("chia het cho 3 va 5:%d",b);
        }
        else{
            System.out.printf("k chia het cho 3 va 5:%d",b);
        }

    }
}
