public class ReturnMethodValue {

    public static void main(String[] args) {

        var a = 100;
        var b = 200;

        var c = sum(a, b);
        System.out.println(c);

        var result1 = sum(1, 2);

        System.out.println(result1);
        System.out.println(sum(5, 5));
        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(300, "-", 200));
        System.out.println(hitung(1, "*", 2));
        System.out.println(hitung(5, "/", 5));
    }

    static int sum( int value1, int value2){

        var total = value1 + value2 ;
        return total;
    }

    static int hitung(int value1, String operasi, int value2){

        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return  value1 - value2;
            case "/" :
                return value1 / value2;
            case "*" :
                return value1 * value2;
            default:
                return 0;
        }

    }


}
