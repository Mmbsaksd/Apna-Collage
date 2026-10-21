import java.util.Scanner;

public class a3 {
    public static void pattern(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();

        }
    }public static void inverted_triangle(int num){
        for(int i=1;i<=num;i++){
            for (int j=1;j<=num-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
    public static void floyd(int num){
        int a=1;
        for (int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
    public static void zo(int num){
        int a=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                a++;
                if(a%2==0){
                    System.out.print(0+" ");
                }else{
                    System.out.print(1+" ");
                }
            }System.out.println();
        }
    }
    public static void oz(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if((i+j)%2==1){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }System.out.println();
        }
    }

    public static void butterfly(int num){
        for(int i=1;i<=num;i++){
            // star-i
            for(int j=1;j<=i;j++){
                System.err.print("* ");
            }
            for(int j=1;j<=2*(num-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int i=num;i>=1;i--){
            // star-i
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(num-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void rombus(int num){
        for(int i=1;i<=num;i++){
            for(int j=num-i;j>=1;j--){
                System.out.print("  ");

            }
            for(int j=1;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void hollow_rombus(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }for(int j=1;j<=num;j++){
                if(i==1||i==num||j==1||j==num){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    public static void dimound(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }System.out.println();
        }
        for(int i=num-1;i>=1;i--){
            for(int j=1;j<=num-i;j++){
                System.out.print("  ");
            }for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // oz(num);
        // butterfly(num);
        // rombus(num);
        // hollow_rombus(num);
        dimound(num);
    }
    
}
