import java.util.Scanner;
public class Pattern16{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value");
        int row=sc.nextInt();
        
        for(int i=1;i<=row;i++){
            int x=2;
            for(int j=1;j<=i;j++){
                System.out.print(x+ "  ");
                x+=2;
            }
            System.out.println("");
        }

    }
 
}

