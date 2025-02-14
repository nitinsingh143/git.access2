import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter trhe value");
        int row=sc.nextInt();
        int n=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(n%2+ " ");
                n++;
            }
            System.out.println();
        }
    }
}
