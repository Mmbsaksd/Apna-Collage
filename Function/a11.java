public class a11 {
    public static void db(int num){
        int bin=0;
        int pow=0;
        while(num>0){
            int rem = num%2;
            bin = bin+rem*(int)Math.pow(10,pow);
            num/=2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        db(8);
    }
    
}
