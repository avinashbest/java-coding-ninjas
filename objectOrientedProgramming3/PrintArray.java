package objectOrientedProgramming3;

public class PrintArray {

    public static <T> void printArray(T[] arr) {
        for (T i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor(Math.random() * 100);
        }
        printArray(arr);

        String[] str = new String[10];
        for (int i = 0; i < arr.length; i++) {
            str[i] = "avi";
        }
        printArray(str);
    }
}
