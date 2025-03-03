public class Variable {

    public static void main(String[] args) {

        String name;
        name = "Jaisyu Nur Muhammadi";

        System.out.println(name);

        int age = 18;
        String address = "Magelang";

        System.out.println(age);
        System.out.println(address);

        //name = "Afrizal";  program java inisiasi dari atas ke bawah jadi ketumpuk namanya
        //System.out.println(name); variable di java itu static type variable,
        // tidak bisa menggunakan  var yg sama dengan tipe data yang berbeda

        var firstName = "Jaisyu";
        var middleName = "Nur";
        var lastName = "Muhammadi";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        final double phi = 3.14;

        System.out.println(phi);

        //var phi = 6.28;// akan terjadi error karena final merupakan constant
        //System.out.println(phi);

        //var address; //akan terjadi error, var harus inisialisasi tipe data karena java secara pintar menilai tipe data
        //address = "magelang"



    }

}
