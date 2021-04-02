package arrays;

public class HowArrayStored {
    //    non-primitive data types in java are pass by reference
    public static void incrementArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]++;
        }
    }

    //    primitive data types in java are pass by value
    public static void incrementInteger(int i) {
        i = i + 1;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int i = 10;
        incrementInteger(i);
        System.out.println(i);

        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr); /*print the address of the memory location which arr is referencing*/
        incrementArray(arr);
        displayArray(arr);
    }
}
