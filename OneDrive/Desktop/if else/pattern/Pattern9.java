import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of row");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int s=1;s<=i;s++){
                System.out.print(" ");
            }
            for(int j=row;j>=i;j--){
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }

}