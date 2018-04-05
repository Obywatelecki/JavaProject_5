package homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    private static Integer secondLargestNumber(List<Integer> arr) {

        Integer maxVal = Integer.MIN_VALUE;
        Integer secondMaxVal = Integer.MIN_VALUE;

        for (Integer anArr : arr) {
            if (anArr > maxVal) {
                maxVal = anArr;
            }
        }

        arr.remove(maxVal);

        for (Integer anArr : arr) {
            if (anArr > secondMaxVal && anArr <= maxVal) {
                secondMaxVal = anArr;
            }
        }

        return secondMaxVal;
    }

    @Test
    public void test() {

        List<Integer> minusArr = new ArrayList<>(Arrays.asList(-1, -1, -3, -4));
        List<Integer> plusArr = new ArrayList<>(Arrays.asList(1, 2, 3, 3));

        System.out.println(Homework.secondLargestNumber(minusArr));
        System.out.println(Homework.secondLargestNumber(plusArr));
    }
}
