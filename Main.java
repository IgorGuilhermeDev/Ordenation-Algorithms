public class Main{
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 9, 17, 0 ,6};
        System.out.println("Array não ordenado:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        InsertionSort.insertionSort(arr);

        System.out.println("\nArray ordenado usando Selection Sort:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}