package twoDimensionalArray;

public class How2dArraysAreStored {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        /*Holds the reference of master array or array of references*/
        System.out.println("Array of Reference which holds the reference of each 1D-Array @ arr: " + arr);
        /*Each references are of 1D-Array*/
        System.out.println("Each references of 1D-Arrays @ arr[0]: " + arr[0]);
        System.out.println("Each references of 1D-Arrays @ arr[1]: " + arr[1]);
        System.out.println("Each references of 1D-Arrays @ arr[2]: " + arr[2]);
        /*Elements of the 1D-Array*/
        System.out.print(arr[0][0] + "\t");
        System.out.print(arr[0][1] + "\t");
        System.out.print(arr[0][2] + "\t");
        System.out.print(arr[0][3] + "\t");

        System.out.println();

        System.out.print(arr[1][0] + "\t");
        System.out.print(arr[1][1] + "\t");
        System.out.print(arr[1][2] + "\t");
        System.out.print(arr[1][3] + "\t");

        System.out.println();

        System.out.print(arr[2][0] + "\t");
        System.out.print(arr[2][1] + "\t");
        System.out.print(arr[2][2] + "\t");
        System.out.print(arr[2][3] + "\t");

        System.out.println();

        /*Number of rows*/
        System.out.println("Number of rows: " + arr.length);
        /*Number of columns*/
        System.out.println("Number of columns: " + arr[0].length);
    }
}
