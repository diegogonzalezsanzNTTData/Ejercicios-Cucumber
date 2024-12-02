package utilities.object_sum_list_integer;

import java.util.ArrayList;
import java.util.List;

public class SumListInteger {

    private List<Integer> listNumbers;
    private double average;

    public SumListInteger() {
        this.listNumbers = new ArrayList<>();
        this.average = 0.0;
    }

    public SumListInteger(List<Integer> listNumbers, double average) {
        this.listNumbers = listNumbers;
        this.average = average;
    }

    public List<Integer> getListNumbers() {
        return listNumbers;
    }

    public void setListNumbers(List<Integer> listNumbers) {
        this.listNumbers = listNumbers;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

}
