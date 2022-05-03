public class Computer {

    public String concatText(String firstText, String secondText) {
        String result = firstText.concat(secondText);
        return result;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int binar(int n) {
        int i = bitsInNumber(n);
        int bit;
        StringBuilder stringBuilder = new StringBuilder();
        while (--i >= 0) {
            bit = (n & (1 << i)) == 0 ? 0 : 1;
            stringBuilder.append(bit);
        }
        int result = Integer.parseInt(String.valueOf(stringBuilder));
        return result;
    }

    public static int bitsInNumber(int n) {
        int res = 0;
        while (n > 0) {
            n >>= 1;
            res++;
        }
        return res;
    }
}
