public class SwitchStatementJava {

    public static void main(String[] args) {

        var nilai = "A";

        //switch seperti if
        switch (nilai) {
            case "A":
                System.out.println("Selamat, Anda lulus dengan baik!");
                break;
            case "B":
            case "C":
                System.out.println("Selamat, Anda lulus!");
                break;
            case "D":
                System.out.println("Silahkan coba lagi tahun depan");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan! :(");
        }

//Menggunakan switch lambda semenjak Java14
        switch (nilai){
            case "A" -> System.out.println("Baik sekali!");
            case "B" -> System.out.println("Baik");
            case "C" -> System.out.println("Cukup Baik");
            case "D" -> System.out.println("Kurang Baik");
            default -> {
                System.out.println("Nyasar jurusan bro?");
            }




        }
// Akan ribet jika tidak menggunakan yield

        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Wow Anda Lulus Dengan Baik";
            case "B", "C" -> ucapan = "Anda Lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Mungkin Anda Salah Jurusan";
        }
        System.out.println(ucapan);

        //yield artinya menghasilkan,  jadi di sini menghasilkan sebuah string yang memiliki beberapa kasus,
        //kasus ini dipecahkan dengan switch dan yield, yieald baru ada di java14

        ucapan = switch (nilai) {
            case "A":
                yield "Azzekk!";
            case "B":
                yield "okey";
            case "C":
                yield "Not Bad";
            case "D":
                yield "Meh!";
            default:
                yield "Nyasar lu";



        };
        System.out.println(ucapan);

    }
}
