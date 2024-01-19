import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mời bạn nhập a:");
        int a=Integer.parseInt(scanner.nextLine());
        if(a%2==0){
            System.out.println("số chẵn");
        }
        else{
            System.out.println("số lẻ");
        }
    }
}
