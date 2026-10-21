import java.util.Scanner;

public class a10 {
    public static void isPalindrome(int num){
        int dup = num;
        int rev=0;
        while (dup>0) {
            int rem = dup%10;
            rev = rem+rev*10;
            dup = dup/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number here: ");
        int num = sc.nextInt();
        isPalindrome(num);
    }
    
}
