public class Ex2 {

    public static void chiffreUnite(int n) {
        String[] str = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        if (n != 0) System.out.print(str[n]);
    }

    public static void chiffreDizaine(int n) {
        String[] str = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        if (n != 0) System.out.print(str[n]);
    }

    public static void chiffreCentaine(int n) {
        String[] str = new String[]{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        if (n != 0) System.out.print(str[n]);
    }

    public static void chiffreMillier(int n) {
        for (int i = 0; i < n; i++) System.out.print("M");
    }



    public static void toRomanNumber(int n) {
        chiffreMillier(n/1000);
        chiffreCentaine(n%1000/100);
        chiffreDizaine(n%100/10);
        chiffreUnite(n%10);
        System.out.println();
    }


    public static void main(String[] args) {
        toRomanNumber(1999);
        toRomanNumber(334);
        toRomanNumber(487);
    }
}
