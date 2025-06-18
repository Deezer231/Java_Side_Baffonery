import java.util.*;

public class MergeBubbleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of your Array");
        int size = scanner.nextInt();

        // Read the array elements
        int[] array = new int[size];
        System.out.println("Enter the elements in your Array");
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(500);
            // scanner.nextInt();
        }

        // Perform merge sort
        mergeSort(array, 0, size - 1);

        // Print the sorted array in the specified format
        System.out.print("Your MS Sorted Array is: [");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        scanner.close();
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (right - left + 1 <= 9) {
            bubbleSort(array, left, right);
            System.out.println("Bubble Sorting");
        } else if (left < right) {
            System.out.println("Merge Sorting");
            int mid = left + (right - left) / 2;

            // Sort the first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    private static void bubbleSort(int[] array, int left, int right) {
        for (int i = left; i <= right; i++) {
            for (int j = left; j < right - (i - left); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftArray = new int[n1], rightArray = new int[n2];
        for (int i = 0; i < n1; i++)
            leftArray[i] = array[left + i];
        for (int i = 0; i < n2; i++)
            rightArray[i] = array[mid + 1 + i];
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j])
                array[k++] = leftArray[i++];
            else
                array[k++] = rightArray[j++];
        }
        while (i < n1)
            array[k++] = leftArray[i++];
        while (j < n2)
            array[k++] = rightArray[j++];
    }
}
