public class Ex2 {
    public static boolean ariveOBato(int length, int width, boolean trace) {
        int x = 0;
        int y = width/2;

        while (y >= 0 && y < width && x >= 0) {
            int r = Ex1.generateRandom(0, 100);

            if (r < 50) x++;
            else if (r < 70) y--;
            else if (r < 90) y++;
            else x--;

            if (trace) affichePlanche(length, width, x, y);

            if (x >= length) return true;
        }
        return false;
    }

    public static void affichePlanche(int length, int width, int x, int y) {
        Ut.clearConsole();
        for (int X = 0; X < length; X++) {
            for (int Y = 0; Y < width; Y++) {
                if (X == x && Y == y) System.out.print("O");
                else if (Y == 0 || Y == width -1) System.out.print("|");
                else if (X == 0 || X == length -1) System.out.print("-");
                else System.out.print(" ");
            }
            System.out.println();
        }
        Ut.pause(1000);
    }

    public static void main(String[] args) {
        System.out.println(ariveOBato(10, 5, true));
    }
}
