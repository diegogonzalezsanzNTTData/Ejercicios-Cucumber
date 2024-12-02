package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class Constants {

    public static final String REGEX_FORMAT_DATE_YYYY_MM_DD = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

    public static final ArrayList<String> CLASSIFY_NUMBERS = new ArrayList<String>(
            Arrays.asList("zero", "positive", "negative"));

    public static final ArrayList<String> PARITY_STATUS = new ArrayList<String>(
            Arrays.asList("odd", "even"));

}
