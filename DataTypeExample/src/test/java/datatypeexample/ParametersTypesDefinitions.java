package datatypeexample;

import io.cucumber.java.ParameterType;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParametersTypesDefinitions {

    @ParameterType("\\[([-?0-9,\\s]+)\\]")
    public List<Integer> listOfIntegers(String numbersString) {
        List<Integer> integers = Arrays.stream(numbersString.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        return integers.isEmpty() ? null : integers;
    }

    @ParameterType("\\[(-?[0-9]+(?:\\.[0-9]+)?(?:,\\s*-?[0-9]+(?:\\.[0-9]+)*)*)\\]")
    public List<Double> listOfDoubles(String numbersString) {
        List<Double> integersAndDoubles = Arrays.stream(numbersString.split(","))
                .map(String::trim)
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        return integersAndDoubles.isEmpty() ? null : integersAndDoubles;
    }

    @ParameterType("\\[([\\w\\s]+(?:,\\s*[\\w\\s]+)*)\\]")
    public List<String> listOfStrings(String stringsString) {
        List<String> strings = Arrays.stream(stringsString.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        return strings.isEmpty() ? null : strings;
    }

    @ParameterType("([0-9]{4}-[0-9]{2}-[0-9]{2})")
    public LocalDate isoDate(String date) {
        return LocalDate.parse(date);
    }

    @ParameterType("\\[\\[([-?0-9,\\s]+(?:\\],\\s*\\[[-?0-9,\\s]+)*)\\]\\]")
    public List<List<Integer>> matrixOfIntegers(String matrixString) {
        String[] rows = matrixString.split("\\],\\s*\\[");
        return Arrays.stream(rows)
                .map(row -> row.replaceAll("[\\[\\]]", "").split(","))
                .map(row -> Arrays.stream(row).map(String::trim).map(Integer::parseInt).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    @ParameterType("\\[\\[([-?0-9.,\\s]+(?:\\],\\s*\\[[-?0-9.,\\s]+)*)\\]\\]")
    public List<List<Double>> matrixOfDoubles(String matrixString) {
        String[] rows = matrixString.split("\\],\\s*\\[");
        return Arrays.stream(rows)
                .map(row -> row.replaceAll("[\\[\\]]", "").split(","))
                .map(row -> Arrays.stream(row).map(String::trim).map(Double::parseDouble).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    @ParameterType("([0-9]{2}:[0-9]{2}:[0-9]{2})")
    public LocalTime isoTime(String time) {
        return LocalTime.parse(time);
    }

    @ParameterType("true|false")
    public boolean booleanValue(String value) {
        return Boolean.parseBoolean(value);
    }

}
