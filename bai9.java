import java.util.Scanner;
 public class bai9 {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("nhap a:");
         int a=scanner.nextInt();
         System.out.println("nhap b:");
         int b=scanner.nextInt();
         System.out.println("nhap c:");
         int c=scanner.nextInt();
         int temp;
        if(b<c){
            temp=b;
            b=c;
            c=temp;
        }
        if(c>a){
            temp=c;
            c=a;
            a=temp;
        }
        if(b>a){
            temp=b;
            b=a;
            a=temp;
        }

        System.out.printf("%d %d %d",a,b,c);

     }
}
