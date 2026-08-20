import java.util.ArrayList;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5, 7};
        int[] arr2 = {2, 3, 4, 6};

        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {

            if (arr1[i] <= arr2[j]) {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr1[i]) {

                    union.add(arr1[i]);
                }

                i++;

            } else {

                if (union.size() == 0 ||
                    union.get(union.size() - 1) != arr2[j]) {

                    union.add(arr2[j]);
                }

                j++;
            }
        }

        while (i < n1) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr1[i]) {

                union.add(arr1[i]);
            }

            i++;
        }

        while (j < n2) {

            if (union.size() == 0 ||
                union.get(union.size() - 1) != arr2[j]) {

                union.add(arr2[j]);
            }

            j++;
        }

        System.out.println(union);
    }
}