package utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import enumerator.OrdenationType;

public class Utils {

    public static int[] generateRandomIntArray(int size, int minRange, int maxRange, OrdenationType ordenationType) {
        if (size <= 0 || minRange > maxRange) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        int[] randomArray = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            randomArray[i] = rand.nextInt(maxRange - minRange + 1) + minRange;
        }

        if (ordenationType == OrdenationType.RANDOM)
            return randomArray;
        else {
            Integer[] newArray = Utils.convertIntArrayToInteger(randomArray);
            Utils.sortArray(newArray, ordenationType);
            return convertIntegerArrayToInt(newArray);
        }
    }

    private static Integer[] convertIntArrayToInteger(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);
    }

    private static int[] convertIntegerArrayToInt(Integer[] arr) {
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }

    private static void sortArray(Integer[] arr, OrdenationType ordenationType) {
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (ordenationType == OrdenationType.ASCENDING)
                    return o1.compareTo(o2);
                return o2.compareTo(o1);
            }
        });
    }

}