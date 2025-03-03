public class Continue {

    public static void main(String[] args) {

        for( var counter = 1 ; counter <= 100 ; counter++ ){

            if(counter % 2 == 0) {
                continue; // menghentikan perulangan saat ini dan melanjutkan perulangan selanjutnya
                            // kaya di-skip gitu jadinya cuma ada pola
            }
                System.out.println("Perulangan ganjil ke-" + counter);

        }


    }
}
