import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap chi so dien cu:");
        int numberOld=scanner.nextInt();
        System.out.print("nhap  chi so dien moi:");
        int numberNew=scanner.nextInt();
        int number=numberNew-numberOld;
        int kq;
        if(number>=0&&number<50){
            kq=number*10000;
            System.out.printf("tien dien:%d",kq);
        }
        else if(number<100){
            kq=number*15000;
            System.out.printf("tien dien:%d",kq);
        }
        else if(number<150){
            kq=number*20000;
            System.out.printf("tien dien:%d",kq);
        }
        else if(number<200){
            kq=number*25000;
            System.out.printf("tien dien:%d",kq);
        }
        else{
            kq=number*30000;
            System.out.printf("tien dien:%d",kq);
        }


    }
}
