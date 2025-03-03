public class Array {

    public static void main(String[] args) {

        String[] stringArray; //Membuat array indirect var
        stringArray = new String[3]; //new untuk inisialisasi indeks array

        stringArray[0] = "Jaisyu";
        stringArray[1] = "Nur";
        stringArray[2] = "Muhammadi";

        stringArray[0] = "Kiqi";
        stringArray[0] = ""; //menghapus isi array menjadi kosong


        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);


        String[] stringArray2 = new String[5];

        stringArray2[0] = "hello";
        stringArray2[1] = "world";

        System.out.println(stringArray2[0]);
        System.out.println(stringArray2[1]);
        System.out.println(stringArray2[2]);

// di bawah ini membuat array tanpa satu satu
        String[] namaNama = new String[]{
                "Jaisyu", "Nur", "Muhammadi"

        };

        System.out.println(namaNama[0]);
// tanpa satu satu plus tanpa inisialisasi new
        Integer[] iniInt2 = {
                1, 2, 3, 4
        };

        iniInt2[0] = null;

        System.out.println(iniInt2[0]);
        System.out.println(iniInt2[1]);


        long[] arrayLong2 = {
                10L, 20L, 30L
        };

        arrayLong2[1] = 1000;
        arrayLong2[1] = 0;


        System.out.println(arrayLong2[0]);
        System.out.println(arrayLong2[1]);
        System.out.println(arrayLong2.length);


        String iniPembatas = "--------------------------------------------------------------------";
        System.out.println(iniPembatas);

//Di bawah ini merupakan Array di dalam  Array
        String[][] members = {
                {"Jaisyu", "Afrizal", "Kusuma"},
                {"Hami", "Muhammadi", "Rizqi"},
                {"Altiano", "Firdauzan", "Nur"}
        };

        System.out.println(members[0][0]);
        System.out.println(members[2][2]);
        System.out.println(members[1][1]);

    }





}
