public class methods {
    public static void main(String[] args){

        //4 basamakli perfect sayiyi bulma programi ----->8128
        int n=1000;
        while(!isPerfect(n)){
           n++;
        }
        System.out.print(n);
        //****************************************************

    }

    public static int sumFactors(int n){   //1 ve kendisi haric tüm çarpanların toplamını bulur
        int sum=0;
        for(int i=2;i<n;i++) {
            if(n%i ==0)
                sum=sum+i; }
        return sum;
    }

    public static boolean areFriends(int x,int y){
        if(sumFactors(x)+1==y && sumFactors(y)+1==x)  //buradaki +1ler sumfactor methodundaki eksik 1 için tanımlandi
            return true;
        else return false;
    }
    public static boolean isPerfect(int n){
        if(sumFactors(n)+1==n)
            return true;
        else return false;

    }
}
