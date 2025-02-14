import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter the value");
        int row = sc.nextInt();
         
         for (int i=1 ; i<=row ; i++){
         
        for(int j=1;j<=i;j++){
System.out.print("*");
        }
              System.out.println();
     }
 for(int i=1;i<=row;i++){
            // for(int s=row-1;s>=i;s--){
            //     System.out.print(" ");
            // }

            for(int j=row-1;j>=i;j--){
                 System.out.print("*");
            }
                   System.out.println();
        }


    }
}