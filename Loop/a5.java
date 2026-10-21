import java.util.Scanner;

public class a5 {

    public static void main(String[] args) {
        System.out.print("Enter your number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n=0;
        while(n<num){
            n++;
            if (n%10==0) {
                continue;
                
            }else{
                System.out.println(n);
            }
            
        }
    }
}