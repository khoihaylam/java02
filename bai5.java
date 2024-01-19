import java.util.Scanner;
public class bai5 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi nhap a:");
        double a=scanner.nextDouble();
        System.out.println("moi nhap b:");
        double b=scanner.nextDouble();
        System.out.println("moi nhap c:");
        double c=scanner.nextDouble();
        if(a+b>c &&b+c>a && a+c>b){
            if(a==b&&b==c){
                System.out.println("la tam giac deu");
            }
            else if(a*a+b*b==c*c ||b*b+c*c==a*a || a*a+c*c==b*b){
                System.out.println("la tam giac vuong");
            }
            else if(a==b ||b==c||c==a){
                System.out.println("la tam giac can");
            }
            else{
                System.out.println("la tam giac thuong");
            }
        }
        else{
            System.out.println("khong phai la tam giac");
        }


    }

}
