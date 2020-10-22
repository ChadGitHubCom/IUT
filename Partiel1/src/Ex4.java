public class Ex4 {

    public static int moyenneIntervalle(int[] t, int debut, int fin) {
        if (!(0 <= debut && debut < fin && fin < t.length)) return 0;

        int somme = 0;

        for (int i = debut; i <= fin; i++) somme += t[i];

        return somme / (fin - debut);
    }

    public static boolean chaudAvant(int[] tTemp, int j, int d, int t) {
        if (!( 1 <= d && d <= j && j < tTemp.length)) return false;

        int moyenne = moyenneIntervalle(tTemp, j - d, j);

        if (moyenne >= t) return true;
        else return false;
    }

    public static boolean froidApres(int[] tTemp, int j, int d, int t) {
        if (!( 1 <= d && d <= j && j < tTemp.length && d + j < tTemp.length)) return false;

        int moyenne = moyenneIntervalle(tTemp, j, j + d);

        if (moyenne < t) return true;
        else return false;
    }
}