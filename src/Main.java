import java.util.Scanner;

public class Main {

    static void dizidekiMinVeMaxDeger(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Dizideki en küçük sayı : " + min);
        System.out.println("Dizideki en büyük sayı : " + max);
    }

    static void girilenSayidanKucukEnBuyukDeger(int[] arr, int sayi) {
        int temp = 10000, sayidanKucukEnbDeger=10000,counter=0;
        for (int i : arr) {
            int diff = sayi - i;
            if (diff > 0 && diff < temp) {
                counter++;
                temp = diff;
                sayidanKucukEnbDeger = i;
            }
        }
        if(counter==0){
            System.out.println("Girilen sayıdan küçük dizide eleman bulunamadı");
        }
        else{
            System.out.println("Girilen sayıdan küçük en büyük sayı : " + sayidanKucukEnbDeger);
        }

    }

    static void girilenSayidanBuyukEnkDeger(int[] arr,int sayi){
        int temp=10000,sayidanBuyukEnkDeger=0,counter=0;
        for(int i:arr){
            int diff=i-sayi;
            if(diff>0 && diff<temp){
                counter++;
                temp=diff;
                sayidanBuyukEnkDeger=i;
            }
        }
        if(counter==0){
            System.out.println("Girilen sayıdan büyük dizide eleman bulunamadı");
        }
        else{
            System.out.println("Girilen sayıdan büyük en küçük sayı : " + sayidanBuyukEnkDeger);
        }
    }

    public static void main(String[] args) {

        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = sc.nextInt();
        System.out.println("Girilen sayı : " + sayi);
        System.out.println("==========================================================");
        dizidekiMinVeMaxDeger(arr);
        System.out.println("==========================================================");
        girilenSayidanKucukEnBuyukDeger(arr, sayi);
        System.out.println("==========================================================");
        girilenSayidanBuyukEnkDeger(arr, sayi);


    }


}
