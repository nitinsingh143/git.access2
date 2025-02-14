import java.util.Scanner;
public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of row");
        int row=sc.nextInt();
        
        for(int i=1;i<=row;i++){
            for(int s=row-1;s>=i;s--){
                System.out.print(" ");
            }
            int n=row;
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n--;
            }
            System.out.println();
            
        }
       
    }
}
