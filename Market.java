package regular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Market {
    public static void main(String[] args) {

         /*
             Marketteki tum tum urunleri bir Array'de tuttugumuzu varsayalim.
             Kullaniciya index sorup, o indexdeki urunu yazdiran bir program yaziniz.

             (Kullanici marketteki urun sayisindan fazla sayida bir index girerse exception vermesinin onune gecelim)

         */

        String urunler[] = {"Et", "Sut", "Findik", "Fistik"};

        Scanner input ;
        boolean flag = true;

        int idx = 0;

        while (flag) {

            try {
                input = new Scanner(System.in);
                System.out.println("Istedeginiz urunun sira numarasini giriniz ");
                idx = input.nextInt();
                flag = false;

            } catch (InputMismatchException e) {
                e.printStackTrace();
            }
        }

        try {
            System.out.println(urunler[idx]);// olmayan bir index girdiyse
        } catch (ArrayIndexOutOfBoundsException e) {
           e.printStackTrace();
        }


    }
}
