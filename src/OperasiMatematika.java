public class OperasiMatematika {

    public static void main(String[] args) {

        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        int c = 100;

        //c+=2 //ini namanya augmented assignment
        System.out.println(c+=2);
        //c-=2
        System.out.println(c-=2);
        c*=2;//bisa di luar sout maupun di dalam sout
        System.out.println(c);
        System.out.println(c/=2);
        System.out.println(c%=2);

        int d = +100; //default nya positif tidak perlu diberi tambah juga tidak masalah
        int e = -10;

        d++; //ini merupakan unary operator
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!true);

    }
}
