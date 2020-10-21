public class Ex1 {

    public static void suiteOrOrdre(int n) {
        int Up = 1; int U = 1; double V; double PV;

        for (int i = 2; i <= n; i++) {
            V = (double) U / Up;

            PV = V * V - V - 1;

            System.out.println("i = " + i + " | Vi = " + V + " | P(Vi) = " + PV);

            U = U + Up;
            Up = U - Up;
        }
    }

    public static void suiteOrEpsilon(double e) {
        double or = (1 + Math.sqrt(5)) / 2;

        int Up = 1; int U = 1; double V; double PV;

        int i = 2;
        do {
            V = (double)U / Up;

            PV = V * V - V - 1;

            System.out.println("i = " + i + " | Vi = " + V + " | P(Vi) = " + PV);

            U = U + Up;
            Up = U - Up;

            i++;
        } while (Math.abs(V - or) >= e);
    }

    public static void experience(double e) {double or = (1 + Math.sqrt(5)) / 2;

        int Up = 1; int U = 1; double V; double VP = 0; double W; double PV;

        int i = 2;
        do {
            V = (double) U / Up;

            PV = V * V - V - 1;

            W = (V + VP) / 2;

            System.out.println("i = " + i + " | Vi = " + V + " | Wi = " + W + " | P(Vi) = " + PV);

            U = U + Up;
            Up = U - Up;
            VP = V;

            i++;
        } while (Math.abs(V - or) >= e && Math.abs(W - or) >= e);

        if (Math.abs(V - or) > Math.abs(W - or)) System.out.println("Wi arrive plus vite que le nombre d'or");
        else if (Math.abs(V - or) < Math.abs(W - or)) System.out.println("Vi arrive plus vite que le nombre d'or");
        else System.out.println("Il arrive aussi vite au nombre d'or");
    }

    public static void menu() {
        while (true) {
            System.out.println();
            System.out.println("Veuillez entrer votre choix:");
            System.out.println("1, suiteOrOrdre");
            System.out.println("2, suiteOrEpsilon");
            System.out.println("3, expérience plus rapide entre Vi et Wi");
            System.out.println("4, quitter le menu");

            int r = Ut.saisirEntier();
            if (r == 1) {
                System.out.println("Entrer n");
                int n = Ut.saisirEntier();
                suiteOrOrdre(n);
            } else if (r == 2) {
                System.out.println("Entrer e");
                double e = Ut.saisirReel();
                suiteOrEpsilon(e);
            } else if (r == 3) {
                System.out.println("Entrer e");
                double e = Ut.saisirReel();
                experience(e);
            } else if (r == 4) {
                System.out.println("Fin menu");
                return;
            }else {
                System.out.println("Paramètre incompri");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}
