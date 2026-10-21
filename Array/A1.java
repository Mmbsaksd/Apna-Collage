class a1{
    public static void lr(int arr[],int num){
        for(int i=1;i<=arr.length;i++){
            if(arr[i]==num){
                System.out.print(num+" is located on "+i+" position");
                break;
            }
        }System.out.print(num+" is not in given list");

    }
    public static int bs(int num[], int key){
        int s=0, e=num.length-1;
        while (s<=e) {
            int m = (s+e)/2;
            if(num[m]==key){
                return m;
            }else{
                if(num[m]<key){
                    s=m+1;
                }else{
                    e = m-1;
                }
            }
            
        }
        return -1;
    }
    public static void largest(int num[]){
        int lg=num[0];
        int s =num[0];
        for(int i=1;i<num.length;i++){
            if(lg<num[i]){
                lg = num[i];
            }
            if(s>num[i]){
                s = num[i];
            }
        }
        System.out.println("Largest number is : "+lg);
        System.out.println("Smallest number is: "+s);
    }
    public static void reverse(int num[]){
        int e=num.length-1,s=0;
        while(s<e){
            num[s] = num[s]+num[e];
            num[e] = num[s]-num[e];
            num[s] = num[s]-num[e];
            s++;
            e--;
        }
    }
    public static void pair(int num[]){
        int i=0;
        int 
    }


    public static void main(String[] args) {
        int key = 6;
        int num[]={1,2,3,4,6,7,8,9,10};
        // lr(num, key);
        // largest(num);
        // System.out.println(bs(num, key));
        // reverse(num);
        // for(int i=0;i<num.length;i++){
        //     System.out.print(num[i]+" ");
        // }

    }
}