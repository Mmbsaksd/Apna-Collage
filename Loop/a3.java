import java.util.Scanner;

public class a3 { 
    public static void main(String[] args) {
        System.out.print("Enter your number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Reversed number: ");
        while(num>0){
            System.out.print(num%10+" ");
            num = num/10;
        }

    }
    
}
