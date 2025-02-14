import java.util.Scanner;
public class Pattern12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the value of rows");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int k=row-1;k>=i;k--){
                System.out.print("#");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

