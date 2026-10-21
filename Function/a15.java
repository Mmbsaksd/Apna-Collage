public class a15 {
    public static void dSum(int num){
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        dSum(1234);
    }
    
}
