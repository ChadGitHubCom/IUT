import java.util.Random;

public class Ex1 {
    public static int generateRandom(int min, int max) {
        Random rndm = new Random();
        return min + rndm.nextInt(max - min);
    }

    public static void afficherTestProba(int nbr) {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        for (int i = 0; i < nbr; i++) {
            int r = generateRandom(1, 100);
            if (r < 50) c1++;
            else if (r < 70) c2++;
            else if (r < 90) c3++;
            else c4++;
        }

        System.out.println("C1: " + (double) c1/nbr + " || C2: " + (double) c2/nbr + " || C3: " + (double) c3/nbr + " || C4: " + (double) c4/nbr);
    }
}