public class Ex3 {
    public static int racineParfaite(int n) {
        int r = 0;
        while (r*r < n) {
            r++;
        }
        if (r*r == n) return r;
        else return -1;
    }

    public static boolean estCarreParfait(int n) {
        if (racineParfaite(n) == -1) return false;
        else return true;
    }

    public static boolean canBeRectangle(int a, int b) {
        return estCarreParfait(a*a + b*b);
    }


    public static void main(String[] args) {
        System.out.println(estCarreParfait(9));
        System.out.println(estCarreParfait(10));
        System.out.println(canBeRectangle(4, 3));
        System.out.println(canBeRectangle(3, 1));
    }
}
