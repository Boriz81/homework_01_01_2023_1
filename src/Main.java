import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 10;

        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int j = 0; j < myArray.length; j++) {
            if (j < n) {
                sum++;
            }
        }
        System.out.println(sum);

    }
}