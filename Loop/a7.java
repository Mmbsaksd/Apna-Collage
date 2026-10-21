import java.util.Scanner;

public class a7 {
    public static void main(String[] args) {
        System.out.println("Enter a number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int even=0,odd=0,i;
        for(i=1;i<=num;i++){
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
            
        }

        System.out.println("Sum of Even: "+even);
        System.out.println("Sum of Odd: "+odd);
    }
   

}
