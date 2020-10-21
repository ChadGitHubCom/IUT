public class Ex6 {
    public static int[] compactage(int[] tab) {
        int[] result = new int[tab.length];
        int lastZero = 0;
        boolean[] alreadyMet = new boolean[10];

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0 && !alreadyMet[tab[i]] ) {
                result[lastZero] = tab[i];
                lastZero++;
                alreadyMet[tab[i]] = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i : compactage(new int[]{4, 0, 5, 2, 0, 0, 2, 4, 0, 4})) {
            System.out.print("[" + i + "]");
        }
    }
}
