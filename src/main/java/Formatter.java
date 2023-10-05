public class Formatter {
    public static String getPriceWithRubles(double amount) {

        int integerPart = (int) amount;
        int lastDigit = integerPart % 10;
        int lastTwoDigits = integerPart % 100;

        if (lastTwoDigits >= 10 && lastTwoDigits <= 20) {
            return String.format("%.2f", amount) + " рублей";
        } else if (lastDigit == 1) {
            return String.format("%.2f", amount) + " рубль";
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            return String.format("%.2f", amount) + " рубля";
        } else {
            return String.format("%.2f", amount) + " рублей";
        }
    }
}