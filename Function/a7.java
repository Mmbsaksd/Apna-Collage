public class a7 {
    public static int DC(int d){
        int dec=0;
        int rem;
        int pow=0;
        while (d>0) {
            rem = d%2;
            dec = dec+(int)(rem*Math.pow(10, pow));
            pow++;
            d = d/2;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(DC(8));
        
    }
    
}
