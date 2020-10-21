public class Ex2 {
    public static double verifPluie(int[] tPres, boolean[] tPluie) {
        if (Ex1.jourPressionBasse(tPres) == -1) return -1;

        int dividende = 0;

        int p = Ex1.jourPressionBasseGen(tPres, 0);
        while (p != -1) {
            if (tPluie[p]) dividende++;
            p = Ex1.jourPressionBasseGen(tPres, p +1);
        }

        return (double) dividende / Ex1.jourPressionBasse(tPres);
    }
}