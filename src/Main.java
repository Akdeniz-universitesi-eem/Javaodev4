//Sifre degistirme programi**********************************************************************

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numberofletter=0;
        int numberofnumber=0;
        int numberofspace=0;
        int numberofspecialchar=0;


        String password = JOptionPane.showInputDialog("Şifreniz en az 8 karakterden oluşmalı\nŞifreniz 15karakterden uzun olamaz\nEn az 1 harf içermeli\nEn az 1 numara içermeli\nŞifreniz boşluk içeremez\nEn azından 1 özel karakter bulunmalıdır(!“#$%&‘()*+,-./)\nYeni şifrenizi giriniz:");

        JOptionPane.showMessageDialog(null, password);

         // buradaki değerler ascii tablosuna göre alınmıstır
        for(int i=0;i<password.length();i++)  //harf sayisi bulur
             if((password.charAt(i)>96 && password.charAt(i)<123) || (password.charAt(i)>64 && password.charAt(i)<91))
                  numberofletter++;

        for(int i=0;i<password.length();i++)  //sayi sayisini bulur
            if(password.charAt(i)>47 && password.charAt(i)<58)
                  numberofnumber++;

        for(int i=0;i<password.length();i++)  //boşluk sayisini bulur
            if(password.charAt(i)==32)
                numberofspace++;

        for(int i=0;i<password.length();i++) //özel karakter sayisini bulur
            if(password.charAt(i)>32 && password.charAt(i)<48)
                numberofspecialchar++;


        System.out.println(numberofletter);
        System.out.println(numberofnumber);
        System.out.println(numberofspace);
        System.out.println(numberofspecialchar);

        if(password.length()>7 && password.length()<16 && numberofletter>0 && numberofnumber>0 && numberofspace==0 && numberofspecialchar>0)   //şifre oluşturma koşulları
            JOptionPane.showMessageDialog(null,"şifre başariyla değiştirildi");
        else {
            if (!(password.length() > 7 && password.length() < 16))
                JOptionPane.showMessageDialog(null, "şifre yeterli uzunlukta değil","Uyari",JOptionPane.WARNING_MESSAGE);
            if (!(numberofletter>0))
                JOptionPane.showMessageDialog(null, "şifre en az 1 tane harf içermeli","Uyari",JOptionPane.WARNING_MESSAGE);
            if (!(numberofnumber>0))
                JOptionPane.showMessageDialog(null, "şifre en az 1 tane sayi içermeli","Uyari",JOptionPane.WARNING_MESSAGE);
            if (!(numberofspace==0))
                JOptionPane.showMessageDialog(null, "şifre boşluk içermemeli","Uyari",JOptionPane.WARNING_MESSAGE);
            if (!(numberofspecialchar>0))
                JOptionPane.showMessageDialog(null, "şifre en az 1 tane özel karakter içermeli","Uyari",JOptionPane.WARNING_MESSAGE);
        }


}
}
