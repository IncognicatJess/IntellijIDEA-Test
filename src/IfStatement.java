public class IfStatement {

    public static void main(String[] args) {

        var nilai = 80;
        var absen = 79;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("Selamat Anda Lulus");

        } else{
            System.out.println("Silahkan coba lagi tahun depan");
        }

        if(nilai >= 85 && absen >= 85){
            System.out.println("Nilai Anda A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }



    }

}
//(nilai >= 70 && absen >= 70)