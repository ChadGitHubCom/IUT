public class Ex7 {
    public static void printLongestPlate(char[] tab) {
        int longestI = 0, longest = 1, actualI = 0, actual = 1;
        char longestCarac = tab[0], actualCarac = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] == longestCarac) {
                longest++;
            } else if (tab[i] == actualCarac) {
                actual ++;
                if (actual > longest) {
                    longest = actual;
                    longestI = actualI;
                    longestCarac = actualCarac;
                }
            } else {
                actual = 1;
                actualI = i;
                actualCarac = tab[i];
            }
        }
        System.out.println("Indice: " + longestI + ", car: " + longestCarac + ", taille: " + longest);
    }


    public static void main(String[] args) {
        printLongestPlate(new char[]{'A', 'Z', 'E', 'R', 'R', 'R', 'Z', 'E', 'Z', 'Z', 'Z', 'Z'});
    }
}
