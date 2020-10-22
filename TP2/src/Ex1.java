import java.util.Random;

public class Ex1 {
    public static int generateRandom(int min, int max) {
        Random rndm = new Random();
        return min + rndm.nextInt(max - min);
    }
}
