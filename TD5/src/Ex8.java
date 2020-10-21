public class Ex8 {

    public static int getMostFrequent(int[] tab) {
        int strongest = 1, actualStrongest = 1;
        int n = tab[0], actualN = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i] == n) {
                strongest++;
            } else if (tab[i] == actualN) {
                actualStrongest++;
                if (actualStrongest > strongest) {
                    strongest = actualStrongest;
                    n = actualN;
                }
            } else {
                actualStrongest = 1;
                actualN = tab[i];
            }
        }
        return n;
    }


    public static void main(String[] args) {
        System.out.println(getMostFrequent(new int[]{1, 1, 2, 3, 3, 3, 4, 5, 5}));
    }
}
