public class Ex3 {

    public static int jourDemarrage(int[] t) {
        if (t.length != 365) return 334;

        int counter = 0;

        for (int i = 273; i < 334; i++) {
            if (t[i] < 13) counter++;
            else counter = 0;
            if (counter == 3) return i;
        }

        return 334;
    }
}