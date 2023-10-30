import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import enumerator.OrdenationAlgorithms;
import enumerator.OrdenationType;
import sortAlgorithms.InsertionSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.QuickSort;
import sortAlgorithms.SelectionSort;
import sortAlgorithms.SortResult;
import utils.Utils;

public class Main {

    static final int[] RANDOM_ARR_100 = Utils.generateRandomIntArray(100, 0, 100, OrdenationType.RANDOM);
    static final int[] ASCENDING_ARR_100 = Utils.generateRandomIntArray(100, 0, 100, OrdenationType.ASCENDING);
    static final int[] DESCENDING_ARR_100 = Utils.generateRandomIntArray(100, 0, 100, OrdenationType.DESCENDING);

    static final int[] RANDOM_ARR_1000 = Utils.generateRandomIntArray(1000, 0, 1000, OrdenationType.RANDOM);
    static final int[] ASCENDING_ARR_1000 = Utils.generateRandomIntArray(1000, 0, 1000, OrdenationType.ASCENDING);
    static final int[] DESCENDING_ARR_1000 = Utils.generateRandomIntArray(1000, 0, 1000, OrdenationType.DESCENDING);

    static final int[] RANDOM_ARR_100K = Utils.generateRandomIntArray(100000, 0, 100000, OrdenationType.RANDOM);
    static final int[] ASCENDING_ARR_100K = Utils.generateRandomIntArray(100000, 0, 100000, OrdenationType.ASCENDING);
    static final int[] DESCENDING_ARR_100K = Utils.generateRandomIntArray(100000, 0, 100000, OrdenationType.DESCENDING);

    static final int[] RANDOM_ARR_500K = Utils.generateRandomIntArray(500000, 0, 500000, OrdenationType.RANDOM);
    static final int[] ASCENDING_ARR_500K = Utils.generateRandomIntArray(500000, 0, 500000, OrdenationType.ASCENDING);
    static final int[] DESCENDING_ARR_500K = Utils.generateRandomIntArray(500000, 0, 500000, OrdenationType.DESCENDING);

    static final String RESULTS_FILE_PATH =  "./results.csv";
    public static void main(String[] args) {
        generateReultsOfQuickSort();
        generateReultsOfMergeSort();
        generateReultsOfInsertionSort();
        generateReultsOfSelectionSort();
    }

    private static void generateReultsOfQuickSort() {
        test(100, OrdenationAlgorithms.QUICK_SORT, true);
        test(1000, OrdenationAlgorithms.QUICK_SORT, false);
        test(100000, OrdenationAlgorithms.QUICK_SORT, false);
        test(500000, OrdenationAlgorithms.QUICK_SORT, false);
    }

    private static void generateReultsOfMergeSort() {
        test(100, OrdenationAlgorithms.MERGE_SORT, false);
        test(1000, OrdenationAlgorithms.MERGE_SORT, false);
        test(100000, OrdenationAlgorithms.MERGE_SORT, false);
        test(500000, OrdenationAlgorithms.MERGE_SORT, false);
    }

    private static void generateReultsOfSelectionSort() {
        test(100, OrdenationAlgorithms.SELECTION_SORT, false);
        test(1000, OrdenationAlgorithms.SELECTION_SORT, false);
        test(100000, OrdenationAlgorithms.SELECTION_SORT, false);
        test(500000, OrdenationAlgorithms.SELECTION_SORT, false);
    }

    private static void generateReultsOfInsertionSort() {
        test(100, OrdenationAlgorithms.INSERTION_SORT, false);
        test(1000, OrdenationAlgorithms.INSERTION_SORT, false);
        test(100000, OrdenationAlgorithms.INSERTION_SORT, false);
        test(500000, OrdenationAlgorithms.INSERTION_SORT, false);
    }

    private static void test(int arrayLength, OrdenationAlgorithms algorithm, boolean generateHeader) {
        List<int[]> listOfArrays = getArraysByLengthAndOrdenation(arrayLength);
        int[] randomArray = Arrays.copyOf(listOfArrays.get(0), arrayLength);
        int[] ascendingArray = Arrays.copyOf(listOfArrays.get(1), arrayLength);
        int[] descendingArray = Arrays.copyOf(listOfArrays.get(2), arrayLength);

        if (algorithm == OrdenationAlgorithms.QUICK_SORT) {
            testQuickSort(randomArray, OrdenationType.RANDOM, generateHeader);
            testQuickSort(ascendingArray, OrdenationType.ASCENDING, false);
            testQuickSort(descendingArray, OrdenationType.DESCENDING, false);

        } else if (algorithm == OrdenationAlgorithms.MERGE_SORT) {
            testMergeSort(randomArray, OrdenationType.RANDOM, generateHeader);
            testMergeSort(ascendingArray, OrdenationType.ASCENDING, false);
            testMergeSort(descendingArray, OrdenationType.DESCENDING, false);

        } else if (algorithm == OrdenationAlgorithms.INSERTION_SORT) {
            testInsertionSort(randomArray, OrdenationType.RANDOM, generateHeader);
            testInsertionSort(ascendingArray, OrdenationType.ASCENDING, false);
            testInsertionSort(descendingArray, OrdenationType.DESCENDING, false);

        } else if (algorithm == OrdenationAlgorithms.SELECTION_SORT) {
            testSelectionSort(randomArray, OrdenationType.RANDOM, generateHeader);
            testSelectionSort(ascendingArray, OrdenationType.ASCENDING, false);
            testSelectionSort(descendingArray, OrdenationType.DESCENDING, false);

        }
    }

    private static List<int[]> getArraysByLengthAndOrdenation(int length) {
        List<int[]> groupedArrays = new ArrayList<int[]>();
        if (length == 100) {
            groupedArrays.add(RANDOM_ARR_100);
            groupedArrays.add(ASCENDING_ARR_100);
            groupedArrays.add(DESCENDING_ARR_100);
        } else if (length == 1000) {
            groupedArrays.add(RANDOM_ARR_1000);
            groupedArrays.add(ASCENDING_ARR_1000);
            groupedArrays.add(DESCENDING_ARR_1000);

        } else if (length == 100000) {
            groupedArrays.add(RANDOM_ARR_100K);
            groupedArrays.add(ASCENDING_ARR_100K);
            groupedArrays.add(DESCENDING_ARR_100K);

        } else if (length == 500000) {
            groupedArrays.add(RANDOM_ARR_500K);
            groupedArrays.add(ASCENDING_ARR_500K);
            groupedArrays.add(DESCENDING_ARR_500K);
        }

        return groupedArrays;
    }

    private static void testMergeSort(int[] array, OrdenationType ordenationType, boolean generateHeader) {
        long startTime = System.nanoTime();
        MergeSort.mergeSort(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        SortResult sortResult = new SortResult(startTime, endTime, array.length, "Merge Sort",
                ordenationType);
        sortResult.toCsv(generateHeader, RESULTS_FILE_PATH);
    }

    private static void testInsertionSort(int[] array, OrdenationType ordenationType, boolean generateHeader) {
        long startTime = System.nanoTime();
        InsertionSort.insertionSort(array);
        long endTime = System.nanoTime();
        SortResult sortResult = new SortResult(startTime, endTime, array.length, "Insertion Sort",
                ordenationType);
        sortResult.toCsv(generateHeader, RESULTS_FILE_PATH);

    }

    private static void testSelectionSort(int[] array, OrdenationType ordenationType, boolean generateHeader) {

        long startTime = System.nanoTime();
        SelectionSort.selectionSort(array);
        long endTime = System.nanoTime();
        SortResult sortResult = new SortResult(startTime, endTime, array.length, "Selection Sort",
                ordenationType);
        sortResult.toCsv(generateHeader, RESULTS_FILE_PATH);
    }

    private static void testQuickSort(int[] array, OrdenationType ordenationType, boolean generateHeader) {
        try {
            long startTime = System.nanoTime();
            QuickSort.quickSort(array, 0, array.length - 1);
            long endTime = System.nanoTime();
            SortResult sortResult = new SortResult(startTime, endTime, array.length, "Quick Sort",
                    ordenationType);
            sortResult.toCsv(generateHeader, RESULTS_FILE_PATH);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}