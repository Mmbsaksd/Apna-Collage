public class a14 {
    public static void ispal(int num){
        int dup = num;
        int pal = 0;
        while(dup>0){
            int rem = dup%10;
            pal = (pal*10)+rem;
            dup/=10;
        }
        if(pal==num){
            System.out.println(num+" is a palindrome.");
        }else{
            System.out.println(num+" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        ispal(123);
    }
    
}
