package client;

import java.math.BigInteger;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

import java.text.SimpleDateFormat;

import java.util.Date;

public class MathIslemleri {
    
    public static void main(String[] args) throws NoSuchAlgorithmException {
            // TODO Auto-generated method stub
             
            //Abs       Sayýnýn mutlak deðerini bulur. 
            double sayi1 = -124.23;
            String Mutlak = Double.toString(Math.abs(sayi1));
            System.out.println("Mutlak: " + Mutlak);
     
            //Ceiling   Sayýyý yukarý doðru yuvarlar. 
            double sayi2 = Math.ceil(sayi1);
            String YukariYuvarla  =  Double.toString(sayi2);
            System.out.println("YukariYuvarla: " + YukariYuvarla);
     
            //Exp       e üst deðerini (üstel) hesaplamak için kullanýlýr. 
            double sayi3 = Math.exp(1);
            String EUstel = Double.toString(sayi3);
            System.out.println("EUstel: " + EUstel);
     
            //Floor     Sayýyý aþaðý doðru yuvarlar. 
            double sayi4 = Math.floor(28.98);
            String AsagiYuvarla = Double.toString(sayi4);
            System.out.println("Asaðý Yuvarla: " + AsagiYuvarla);
     
            //Log       e tabanýndaki logaritmayý hesaplar.
            double sayi5 = Math.log(10);
            String LogE = Double.toString(sayi5);
            System.out.println("Log E: " + LogE);
     
            //Log10     Sayýnýn 10 tabanlý logaritmasýný hesaplar 
            double sayi6 = Math.log10(10);
            String Log10 = Double.toString(sayi6);
            System.out.println("Log 10: " + Log10);
     
             
            //Max       Ýki sayýdan büyük olanýný bulur.
            //Min       Ýki sayýdan küçük olaný bulur.
            int s1 = 99;
            int s2 = 88;
            String Maksimum = "Maksimum: " + Integer.toString(Math.max(s1, s2));
            String Minimum = "Minimum: " + Integer.toString(Math.min(s1, s2));
            System.out.println("Maksimum: " +  Maksimum); 
            System.out.println("Minimum: " + Minimum);
             
            //Pow       Sayý üst alma iþlemini yapmak için kullanýlýr. 
            int taban = 3;
            int us = 4;
            String Kuvvet = "Kuuveti: " + Double.toString(Math.pow(taban, us));
            System.out.println("Taban: " + taban + " us: " + us + " Sonuc: " + Kuvvet);
     
            //Round     Sayýyý en yakýn tamsayýya çevirir, 
            String Yuvarlama = Double.toString(Math.round(28.88));
            System.out.println("Yuvarlama: " + Yuvarlama);
           
           //Sqrt   Karakökönü alýr.
            double sayi = 99;
            String Karekok = Double.toString(Math.sqrt(sayi));
            System.out.println("Karekok: " + Karekok);
            System.out.println("tessssst");
             double sayi30 = Math.sqrt(20171227);
             System.out.println("say?: " + sayi30);
                     String EUst = Double.toString(sayi30);
                     System.out.println("EUstel: " + EUst);
             SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
             Date date = new Date();
             String bugun = dateFormat.format(date).toString();
             System.out.println(bugun);
             String sicil = "B60711630";
             String evrakno = "20170567234";
             Double y = Double.valueOf(evrakno);
             Double x = Double.valueOf(bugun);
             Double sayi50 = Math.ceil((y/x)*Math.PI);
             System.out.println("sayi:"+sayi50);
             String plaintext = bugun+sicil;
             System.out.println("hasten once::"+plaintext);
             MessageDigest md = MessageDigest.getInstance("MD5");
                         byte[] messageDigest = md.digest(plaintext.getBytes());
                         BigInteger number = new BigInteger(1, messageDigest);
                         String hashtext = number.toString(16);
                         // Now we need to zero pad it if you actually want the full 32 chars. 
                         while (hashtext.length() < 32) {
                             hashtext = "0" + hashtext;
                         }


             System.out.println("hash:"+hashtext); 
             
        }
}
