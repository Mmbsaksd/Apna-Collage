public class a12 {
    public static void bd(int num){
        int pow=0;
        int dec=0;
        while(num>0){
            int rem = num%10;
            dec+=rem*Math.pow(2,pow);
            num/=10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        bd(111);
        
    }
    
}
