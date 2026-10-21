public class a3 {
    public static int fact(int n){
        int f=1;
        while(n>0){
            f = f*n;
            n--;
        }
        return f;
    }
    public static int binominal(int n,int r){
        int n_f = fact(n);
        int r_f = fact(r);
        int nmr_f=fact((n-r));

        int bc = n_f/(r_f*nmr_f);
        return bc;
    }

    public static void main(String[] args) {
        System.out.println(binominal(12, 6));
        
    }
    
}
