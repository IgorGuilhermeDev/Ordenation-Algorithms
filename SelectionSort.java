public class SelectionSort {
    
    public static SortResult selectionSort(int[] arr) {
        long startTime = System.nanoTime();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        long endTime = System.nanoTime();

        return new SortResult(startTime, endTime, n, "Selection Sort");

    }
}
