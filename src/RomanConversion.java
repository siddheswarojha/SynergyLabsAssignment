import java.util.Scanner;

public class RomanConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(integerRomanConverter(num));

    }

    private static final int[] integralValues= {500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romanValues = {"D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static final String integerRomanConverter(int number) {

        int i = floorIndex(number);
        if (number == integralValues[i]) {
            return romanValues[i];
        }

        return romanValues[i] + integerRomanConverter(number - integralValues[i]);
    }

    private static int floorIndex(int number) {
        for (int i = 0; i < integralValues.length; i++) {
            while (number >= integralValues[i]) {
                return i;
            }
        }
        return -1;
    }
}
