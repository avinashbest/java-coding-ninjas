package objectOrientedProgramming1.DynamicArray;

public class DynamicArray {
    private int[] arr;
    private int nextElementIndex;

    DynamicArray() {
        this.arr = new int[5];
        this.nextElementIndex = 0;
    }

    public int size() {
        return this.nextElementIndex;
    }

    public int get(int index) {
        if (index >= nextElementIndex) {
            /*throw error*/
            return -1;
        }
        return arr[index];
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public void add(int value) {
        if (nextElementIndex == arr.length) {
            doubleCapacity();
        }
        this.arr[nextElementIndex] = value;
        nextElementIndex++;
    }

    private void doubleCapacity() {
        int[] temp = arr;
        arr = new int[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public void set(int index, int value) {
        if (index >= nextElementIndex) {
            /*throw error*/
            return;
        }
        arr[index] = value;
    }

    public int removeLast() {
        if (nextElementIndex == 0) {
            return -1;
        }
        int temp = arr[nextElementIndex - 1];
        nextElementIndex--;
        return temp;
    }
}
