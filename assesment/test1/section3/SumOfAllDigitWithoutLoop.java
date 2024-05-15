package assesment.test1.section3;

public class SumOfAllDigitWithoutLoop {
    public static int sumOfDigits(String str) {
        return str.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sum();
    }

    public static void main(String[] args) {
        String input = "abc123def456";
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits: " + sum);
    }
}