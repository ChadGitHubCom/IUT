import java.util.ArrayList;

public class Ex2 {

    //1 & 3)
    public static boolean ariveOBato(int length, int width, boolean trace) {
        ArrayList<int[]> mooves = new ArrayList<>();
        
        int x = 0;
        int y = width/2;

        while (y < width && x >= 0 && x < length) {
            int r = Ex1.generateRandom(0, 100);

            if (r < 50) x++;
            else if (r < 70) y--;
            else if (r < 90) y++;
            else x--;

            if (y <= 0) {
                x = 0;
                y = width/2;
            }

            mooves.add(new int[]{x, y});

        }
        if (trace) affichePlanche(length, width, mooves);

        if (x >= length) return true;
        else return false;
    }

    //2)
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

    //2 bis)
    public static void affichePlanche(int length, int width, ArrayList<int[]> mooves) {
        for (int i = 0; i < mooves.size(); i++)
            affichePlanche(length, width, mooves.get(i)[0], mooves.get(i)[1]);
    }
}
