import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("enter a size:");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("enter a mark for student " + (i + 1) + "; ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("list of mark");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }

        }
        System.out.print("\n the number of students passing the exam is " + count);
    }
}