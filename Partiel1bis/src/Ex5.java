public class Ex5 {
    public static void verifOracle() {
        for (int i = 1950; i <= 2018; i++) {
            int[] a = recupererTemperatures("Montpellier-Fr ́ejorgues", i);
            int c = Ex3.jourDemarrage(a);

            if (Ex4.chaudAvant(a, c, 15, 16) && Ex4.froidApres(a, c, 15, 15)) System.out.println("OK");
            else System.out.println("KO");
        }
    }

    //ON ASSUME QUE CETTE FONCTION DEMANDE A LA BASE DE DONNEE
    private static int[] recupererTemperatures(String s, int i) {
        return null;
    }

    public static void main(String[] args) {
        double d = 2;
        System.out.println(d/3);
    }
}