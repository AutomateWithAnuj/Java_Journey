package Java_Programs._21_Arrays;

public class P104_Reverse_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using two-pointer approach to reverse the array
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        // Printing reversed array
        System.out.print("Reversed Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
