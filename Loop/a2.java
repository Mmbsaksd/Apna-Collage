import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        System.out.print("Enter size of triangle: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.err.print("* ");
            }System.out.println();
        }
    }
    
}
