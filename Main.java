import java.util.Arrays;

import enumerator.OrdenationType;
import utils.Utils;

public class Main{
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 9, 17, 0 ,6};
        Arrays.stream(Utils.generateRandomIntArray(25, 0, 25, OrdenationType.RANDOM)).forEach((number) -> System.out.print(number + " "));
        System.out.println("Crescente");
        Arrays.stream(Utils.generateRandomIntArray(25, 0, 25, OrdenationType.ASCENDING)).forEach((number) -> System.out.print(number + " "));
        System.out.println("Descrescente");
        Arrays.stream(Utils.generateRandomIntArray(25, 0, 25, OrdenationType.DESCENDING)).forEach((number) -> System.out.print(number + " "));

    }
}