public class a5 {
    public static boolean isprime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        int num = 100;
        primeInRange(num);
        
    }
    
}
