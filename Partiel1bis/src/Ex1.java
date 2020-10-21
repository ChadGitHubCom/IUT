public class Ex1 {

    //a)
    public static int jourPressionBasse(int[] t) {
        int n = 0;
        for (int i : t)
            if (i < 1006) n ++;
        if (n == 0) n--;
        return n;
    }

    //b)
    public static int jourPressionBasseGen(int[] t, int j) {
        if (j >= 0 && j < t.length)
            for (int i = j; i < t.length; i++)
                if (t[i] < 1006) return i;
        return -1;
    }

    //c)
    public static int jourPressionBasseV2(int[]t) {
        int n = 0;
        int p = jourPressionBasseGen(t, 0);
        while (p != -1) {
            n++;
            p = jourPressionBasseGen(t, p +1);
        }
        if (n == 0) n--;
        return n;
    }
}