public class ForEach {

    public static void main(String[] args) {

        String[] Nama = {

                "Jaisyu ", "Nur ", "Muhammadi "
                , "Belajar ", "Java."
        };

      //  for( var i = 0 ; i < Nama.length ; i++ ){
       //     System.out.println(Nama[i]);
       // }

        // Kode di atas masih mengakses satu satu data array menggunakan perulangan
        // Kode commented di atas disederhanakan dengan for each seperti di bawah ini:

        System.out.println("FOR EACH:");

        for(var Kalimat : Nama){
            System.out.print(Kalimat);
        }


    }


}
