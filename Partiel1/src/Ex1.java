public class Ex1 {

    //a)
    public static int jourPressionBasse(int[] t) {
        for (int i : t)
            if (i < 1006) return i;
        return -1;
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
        return jourPressionBasseGen(t, 0);
    }
}