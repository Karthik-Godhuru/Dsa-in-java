public static void main(String[] args) {
    int[] arr = {1, 2, 4, 5};
    int N = 5;

    int xor1 = 0;
    int xor2 = 0;
    int n = N - 1;

    for (int i = 0; i < n; i++) {
        xor2 = xor2 ^ arr[i];
        xor1 = xor1 ^ (i + 1);
    }

    xor1 = xor1 ^ N;

    System.out.print(xor1 ^ xor2);
}