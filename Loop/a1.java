import java.util.Scanner;

class a1{
    public static void main(String[] args) {
        System.out.print("Enter your number here: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count=1;
        int sum=0;
        
        while(num>0){
            sum+=count;
            num--;
            count++;

        }
        System.out.println(sum);
    }
}