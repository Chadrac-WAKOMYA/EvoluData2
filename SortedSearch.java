import java.util.Arrays;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {
        int index = Arrays.binarySearch(sortedArray, lessThan);

        if (index < 0) {
            // Si l'élément n'est pas trouvé, binarySearch retourne -(insertionPoint) - 1
            return -index - 1;
        } else {
            // Si l'élément est trouvé, tous les éléments avant lui sont < lessThan
            return index;
        }
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4)); // Résultat attendu : 2
    }
}
