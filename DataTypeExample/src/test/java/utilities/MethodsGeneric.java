package utilities;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodsGeneric {

    public static boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedAscending(List<? extends Number> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).doubleValue() > numbers.get(i + 1).doubleValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSortedDescending(List<? extends Number> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).doubleValue() < numbers.get(i + 1).doubleValue()) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> convertStringToIntegerList(String numbersString) {
        numbersString = numbersString.replaceAll("\\[|\\]", "").trim();

        List<Integer> integers = Arrays.stream(numbersString.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return integers.isEmpty() ? null : integers;
    }

    public static List<Double> convertStringToDoubleList(String numbersString) {
        numbersString = numbersString.replaceAll("\\[|\\]", "").trim();

        List<Double> doubles = Arrays.stream(numbersString.split(","))
                .map(String::trim)
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        return doubles.isEmpty() ? null : doubles;
    }

    public static Double calculateAverage(List<? extends Number> numbersList) {

        if (numbersList == null || numbersList.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;

        for (Number number : numbersList) {
            sum += number.doubleValue();
        }

        double average = sum / numbersList.size();

        DecimalFormat twoDecimalFormat = new DecimalFormat("#.##");
        String numberInStringFormatted = twoDecimalFormat.format(average);

        return convertCommaToPointAndParseDouble(numberInStringFormatted);
    }

    public static Double convertCommaToPointAndParseDouble(String numberString) {
        String formattedString = numberString.replace(',', '.');

        return Double.valueOf(formattedString);
    }

    public static Integer calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("El número debe ser no negativo.");
        }
        if (number == 0) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static Boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Object convertToAppropriateType(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e1) {
            try {
                return Double.parseDouble(value);
            } catch (NumberFormatException e2) {
                return value;
            }
        }
    }

    public static boolean isAlphabeticallySorted(List<String> words) {
        for (int i = 1; i < words.size(); i++) {
            if (words.get(i - 1).compareToIgnoreCase(words.get(i)) > 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean iCheckIfTheyAreAnagrams(String firstWord, String secondWord) {
        String cleanedFirstWord = firstWord.replaceAll("\\s", "").toLowerCase();
        String cleanedSecondWord = secondWord.replaceAll("\\s", "").toLowerCase();

        if (cleanedFirstWord.length() != cleanedSecondWord.length()) {
            return false;
        }

        char[] transformStringToCharArrayFirstWord = cleanedFirstWord.toCharArray();
        char[] transformStringToCharArraySecondWord = cleanedSecondWord.toCharArray();

        Arrays.sort(transformStringToCharArrayFirstWord);
        Arrays.sort(transformStringToCharArraySecondWord);

        return Arrays.equals(transformStringToCharArrayFirstWord, transformStringToCharArraySecondWord);
    }

}
