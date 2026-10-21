import java.util.Scanner;

class a1{
    public static void main(String arg[]){
        System.out.println("Enter your size of pattern: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i=1;i<=s;i++){
            for(int j=1;j<=s;j++){
                if(i==1||j==1||i==s||j==s){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
}