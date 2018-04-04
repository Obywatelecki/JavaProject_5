package homework;

import org.junit.Test;

public class Homework {

    private static int secondLargestNumber(int[] arr) {

        int maxVal = 0;
        int secondMaxVal = 0;

        for (int anArr : arr) {
            if (anArr > maxVal) maxVal = anArr;
        }

        for (int anArr : arr) {
            if (anArr > secondMaxVal && anArr <= maxVal) secondMaxVal = anArr;
        }

        return secondMaxVal;
    }

    @Test
    public void test() {

        int[] arr = {1, 2, 3, 3};

        System.out.println(Homework.secondLargestNumber(arr));

    }
}
