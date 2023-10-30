import javax.swing.*;

public class esayisiseritoplami {
    public static void main(String[] args){
        byte howmany=25;       // buradan istenilen sayida seri sayisi girilebilir
        float sum=0;
        for(int i=0;i<howmany;i++){
            sum=sum+((float) 1 /factorialof(i));
        }

        JOptionPane.showMessageDialog(null,sum);

    }
    public static int factorialof(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
