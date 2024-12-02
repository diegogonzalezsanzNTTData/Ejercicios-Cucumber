package utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

    private static final String REGEX_FORMAT_DATE_YYYY_MM_DD = "^[0-9]{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

    private static final String REGEX_FORMAT_TIME_HH_MM_SS = "^([0-1]?\\d|2[0-3]):([0-5]?\\d)$";

    public static boolean isValidDate(String date) {
        return matches(date, REGEX_FORMAT_DATE_YYYY_MM_DD);
    }

    public static boolean isValidTime(String time) {
        return matches(time, REGEX_FORMAT_TIME_HH_MM_SS);
    }

    private static boolean matches(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }

}
