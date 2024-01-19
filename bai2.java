import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập điểm html:");
        double html=scanner.nextDouble();
        System.out.println("nhập điểm css:");
        double css=scanner.nextDouble();
        System.out.println("nhập điểm javascript:");
        double javascript=scanner.nextDouble();
        double avg=(html+css+javascript)/3;
        if(avg>=0 &&avg<5){
            System.out.println("hoc lực yeu");
        }
        else if(avg<7){
            System.out.println("hoc lực trung bình");
        }
        else if(avg<8){
            System.out.println("hoc lực khá");
        }
        else if(avg<9){
            System.out.println("hoc lực gioi");
        }
        else if(avg<=10){
            System.out.println("hoc lực xuat sac");
        }
        else{
            System.out.println("chua xep nang luc");
        }
    }
}
