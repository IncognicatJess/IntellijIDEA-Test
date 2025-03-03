public class KonversiNumber {

    public static void main(String[] args) { //ketikkan psv "enter" otomatis scripting main

        byte iniByte = 10;
        short iniShort = iniByte;   //wideningCasting, konversi dari kecil ke besar
                                    //byte>short>int>long>float>double


        byte iniByte2 = (byte)iniShort; //narrowingCasting,kebalikan dari widecasting


    }
}
