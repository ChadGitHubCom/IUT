public class Ex5 {
    public static int[] compactage(int[] tab) {
        int[] result = new int[tab.length];
        int lastZero = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                result[lastZero] = tab[i];
                lastZero++;
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
