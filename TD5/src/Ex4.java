public class Ex4 {
    public static boolean sontNombresAmis(int a, int b) {
        int sommeA = 0, sommeB =0;
        for (int i = 1; i < a/2 +1; i++) if (a%i == 0) sommeA += i;
        for (int i = 1; i < b/2 +1; i++) if (b%i == 0) sommeB += i;

        if (sommeB == a && sommeA == b) return true;
        else return false;
    }

    public static void printToutNombreAmis(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sontNombresAmis(i, j)) {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }


    public static void main(String[] args) {
        printToutNombreAmis(500);
    }
}
