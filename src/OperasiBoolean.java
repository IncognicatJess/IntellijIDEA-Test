public class OperasiBoolean {

    public static void main(String[] args) {

        var nilaiAbsen = 70 ;
        var nilaiAkhir = 80 ;

        var lulusAbsen = nilaiAbsen >= 75;
        var lulusAkhir = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusAkhir;

        System.out.println(lulus);


    }

}
