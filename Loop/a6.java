import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        System.out.print("Enter a number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        boolean result = true;
        if(num<2){
            result=false;
        }else{
            for(i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    result=false;
                }
            }
        }
        if(result){
            System.out.println(num+" is a prime number.");
        }else{
            System.out.println(num+" is not a prime number.");
        }
    }
    
}
