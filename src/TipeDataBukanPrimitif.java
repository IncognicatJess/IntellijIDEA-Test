public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 100_000L;

        Byte iniByte = null; //default value object based adalah null,
        // string merupakan object based/ bukan primitif

        System.out.println(iniByte);

        iniByte = 10;

        System.out.println(iniByte);

        int iniInt = 100;

        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();


    }
}
