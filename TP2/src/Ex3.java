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
            System.out.println("****************************************");
            System.out.println("Choississez un numéro pour une fonction:");
            System.out.println("0: quitter le menu");
            System.out.println("11: afficherTestProba");
            System.out.println("21: arriveOBato, trace affiché");
            System.out.println("31: probaEmpirique");
            System.out.println("32: afficherProba");
            System.out.println("33: largeurMin");

            r = Ut.saisirEntier();

            switch (r) {
                case 0:
                    break;
                case 11:
                    System.out.println("Saisir le minimum puis le maximum puis le nombre de test");
                    Ex1.afficherTestProba(Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirEntier());
                    break;
                case 21:
                    System.out.println("Saisir la longeur puis la largeur");
                    Ex2.ariveOBato(Ut.saisirEntier(), Ut.saisirEntier(), true);
                    break;
                case 31:
                    System.out.println("Saisir la longueur puis la largeur puis le nombre de marin");
                    probaEmpirique(Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirEntier());
                    break;
                case 32:
                    System.out.println("Saisir la longueur minimum puis la longueur maximum puis la largeur puis le nombre de marin");
                    afficherProba(Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirEntier());
                    break;
                case 33:
                    System.out.println("Saisir la longueur puis la largeur minimum puis le nombre de marin puis la probabilité minimum");
                    largeurMin(Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirEntier(), Ut.saisirReel());
                    break;
                default:
                    System.out.println("Paramètre incompris");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        menuMarin();
    }
}
