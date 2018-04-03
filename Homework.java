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
            if (anArr > secondMaxVal && anArr < maxVal) secondMaxVal = anArr;
        }

        return secondMaxVal;
    }

    @Test
    public void test() {

        int[] arr = {1, 3, 4, 1, 2, 8, 17, 5, 2, 5, 21, 5, 2, 2, 20, 22};

        System.out.println(Homework.secondLargestNumber(arr));

    }
}
