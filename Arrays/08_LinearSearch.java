public class LinearSearch {

    public static int linearSearch(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 8, 9};
        int num = 9;

        int result = linearSearch(arr, num);

        System.out.println("Index: " + result);
    }
}