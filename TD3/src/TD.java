public class TD {

    public static void repeteCar(char c, int nbr) {
        for (int i = 0; i<nbr; i++){
            System.out.print(c);
        }
    }

    public static void afficheNombreCroissant(int nb1, int nb2) {
        if (nb1 <= nb2) {
            for (int i = nb1; i <= nb2; i++) {
                System.out.print(i %10);
            }
        }
    }

    public static void afficheNombreDecroissant(int nb1, int nb2) {
        if (nb1 <= nb2) {
            for (int i = nb2; i >= nb1; i--) {
                System.out.print(i %10);
            }
        }
    }

    public static int max2(int a, int b) {
        if (a < b) return b;
        else return a;
    }


    public static int max3(int a, int b, int c) {
        return max2(max2(a, b), c);
    }

    public static int nbrChiffres(int n) {
        int nbr = 1;
        while (n >= 10) {
            n /= 10;
            nbr++;
        }
        return nbr;
    }

    public static int nbrChifresDuCarree(int n) {
        return nbrChiffres(n*n);
    }

    public static boolean isSyracusiens(int n, int nbMaxOp) {
        for (int i = 0; i < nbMaxOp; i++) {
            if (n%2 == 0) {
                n /= 2;
            } else {
                n = 3*n +1;
            }
            if (n == 1) return true;
        }
        return false;
    }

    public static void printNombreTriangle(int periMax) {
        int counter = 0;
        for (int bordA = 1; bordA <= periMax/2; bordA++) {
            for (int bordB = bordA; bordB <= periMax/2; bordB++) {
                double bordC = Math.sqrt(bordA*bordA + bordB*bordB);
                if (bordC%1 == 0 && bordA + bordB + bordC <= periMax) {
                    System.out.println("Triangle trouvé: " + bordA + " | " + bordB + " | " + (int)bordC);
                    counter ++;
                }
            }
        }
        System.out.println("Total de triangles possible: " + counter);
    }

    public static void pyramideElaboree(int n) {

        for (int i= 0; i < n; i++) {
            repeteCar(' ', n - 1 - i);
            afficheNombreCroissant(i+1, i*2 +1);
            afficheNombreDecroissant(i+1, i*2);
            System.out.println();
        }
    }

    public static void pyramide(char c, int nbrLigne) {
        for (int i= 0; i < nbrLigne; i++) {
            repeteCar(' ', nbrLigne -1 -i);
            repeteCar(c, i*2 +1);
            System.out.println();
        }
    }

    public static double approcheEV1(long n) {
        double e = 0.0;
        double j = n*2.0 +-1;
        for(long i = 0; i < n; i++) {

            e = 1/(j-1/(2+e));
            j -= 2;
        }
        e++;
        return e;
    }
    public static double approcheEV2(int n) { //Max: 20, a cause de j
        double e = 1;
        long j = 1;
        for (int i = 1; i <= n; i++) {
            e += 1/(double)j;
            j *= i+1;
        }
        return e;
    }
    public static double approcheEV3(long n) {
        double e = 0.0;
        double j = n*2.0;
        for(long i = 0; i < n; i++) {
            if (j == 2) {
                e = 2 + 1 / ( 1 + 1 / (j + e));
            } else {
                e = 1 / (1 + 1 / (1 + 1 / (j + e)));
            }
            j -= 2;
        }
        return e;
    }


    public static void main(String[] args) {
        pyramide('*', 10); //ex5
        pyramideElaboree(15); //ex6
        System.out.println(max3(15, 142, 1789)); //ex7
        System.out.println(nbrChifresDuCarree(100)); //ex8
        printNombreTriangle(200); //ex9
        for (int i = 1; i <= 30; i++) System.out.println("Nombre: " + i + " | isSyracusiens: " + isSyracusiens(i, 5)); //ex10
        System.out.println("Méthode 1: e ~= " + approcheEV1(10)); //ex11
        System.out.println("Méthode 2: e ~= " + approcheEV2(20)); //ex11
        System.out.println("Méthode 3: e ~= " + approcheEV3(10)); //ex11
    }
}
