import java.util.Random;

public class Filler {
    public static final int MAX_VALUE = 200;
    public static final int MIN_VALUE = -100;
    public static Random random = new Random();

    public static void fill(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(MAX_VALUE + 1) + MIN_VALUE;
            }
        }
    }
}
