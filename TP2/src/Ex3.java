public class Ex3 {

    //1)
    public static double probaEmpirique(int length, int width, int nbrMarin) {
        int arrive = 0;
        for (int i = 0; i < nbrMarin; i++) if (Ex2.ariveOBato(length, width, false)) arrive++;
        return (double) arrive / nbrMarin;
    }

    //2)
    public static void afficherProba(int lengthMin, int lenghtMax, int width, int nbrMarin) {
        for (int i = lengthMin; i <= lenghtMax; i++) System.out.println("Probabilité pour une longueur de " + i + " est de " + probaEmpirique(i, width, nbrMarin));
    }

    //3)
    public static int largeurMin(int length, int widthMin, int nbrMarin, double probaMin) {
        int width = widthMin;
        while (probaEmpirique(length, width, nbrMarin) < probaMin)
            width++;
        return width;
    }

    //4)
    public static void menuMarin() {
        int r = -1;
        while (r != 0) {
            System.out.println();
            System.out.println("Choississez un numé");
        }
    }

    public static void main(String[] args) {
        afficherProba(3, 10, 5, 1000);
    }
}
