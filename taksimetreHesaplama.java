import java.util.Scanner;

public class taksimetreHesaplama {
    public static void main(String[] args) {
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

       int km;
       double perKm = 2.20, total, startPrice = 10;

       Scanner input = new Scanner(System.in);
       System.out.print("Mesafeyi km cinsinden giriniz : ");
       km = input.nextInt();

       total = (km * perKm);
       total += startPrice;

       total = (total < 20 ) ? 20 : total ;
       System.out.println("Toplam tutar: " + total);







    }
}
