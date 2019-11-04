package JAVA.Practice.Files;

public class Digits {
    public static void main(String[] args) {
        //
        int value = 1114;
        int base = 2;
        //
        System.out.println("Decimal value = " + value);
        System.out.println("Binary value  = " + returnBinary(value));
        System.out.println("Hex value     = " + returnHex(value));
        //
        System.out.println("//\n(" + value + ")" + base + " = " + returnDigitWithRandomBase(value, base));
    }

    //
    public static String returnBinary(int value) {
        StringBuilder binary = new StringBuilder();
        int tmp = value;
        do {
            binary.append((tmp % 2));
            tmp /= 2;
        } while (tmp > 0);
        return binary.reverse().toString();
    }

    //
    public static String returnHex(int value) {
        StringBuilder hex = new StringBuilder();
        int tmp = value;
        while (tmp > 0) {
            switch (tmp % 16) {
                case 10:
                    hex.append('A');
                    break;
                case 11:
                    hex.append('B');
                    break;
                case 12:
                    hex.append('C');
                    break;
                case 13:
                    hex.append('D');
                    break;
                case 14:
                    hex.append('E');
                    break;
                case 15:
                    hex.append('F');
                    break;
                default:
                    hex.append(tmp % 16);
                    break;
            }
            tmp /= 16;
        }
        return hex.reverse().toString();
    }

    //
    public static String returnDigitWithRandomBase(int value, int base) {
        StringBuilder digit = new StringBuilder();
        int tmp = value;
        do {
            digit.append((tmp % base));
            tmp /= base;
        } while (tmp > 0);
        return digit.reverse().toString();
    }
    ////
//    //
//    public static int returnDecimal(String value, int system) {
//        switch (system) {
//            case 2:
//                return binaryToDecimal("0101");
//            case 16:
//                return hexToDecimal("45A");
//            default:
//                return randomBaseToDecimal("32");
//        }
//    }
//
//    //
//    public static int binaryToDecimal(String value) {
//        int decimal = 0;
//        StringBuilder stringBuilder = new StringBuilder(value);
//        stringBuilder = stringBuilder.reverse();
//        for (int i = 0; i < value.length(); i++) {
//
//        }
//        return decimal;
//    }
//
//    //
//    public static int hexToDecimal(String value) {
//        int decimal = 0;
//        return decimal;
//    }
//
//    //
//    public static int randomBaseToDecimal(String value) {
//        int decimal = 0;
//        return decimal;
//    }

}