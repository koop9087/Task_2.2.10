public class Calculate {
    public static int[] findPositiveElemsOfMatrix(int[][] array) {
        int size = findSizeOfMas(array);
        int[] mas = new int[size];
        int k = 0;
        for (int i = 0, j = 0; i < array.length && j < array[i].length; i++, j++) {
            if (array[i][j] > 0) {
                mas[k] = array[i][j];
                k++;
            }
        }
        return mas;
    }

    private static int findSizeOfMas(int[][] array) {
        int count = 0;
        for (int i = 0, j = 0; i < array.length && j < array[i].length; i++, j++) {
            if (array[i][j] > 0) {
                count++;
            }
        }
        return count;
    }
}
