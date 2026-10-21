public class a2 {
    public static int factorial(int n){
        int f=1;
        while(n>0){
            f = f*n;
            n--;
        }
        return f;

    }
    public static void main(String[] args) {
        int num=5;
        System.out.println(factorial(num));
        
    }
    
}
