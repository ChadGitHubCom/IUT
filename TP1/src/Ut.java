import java.util.Scanner;

public class Ut {

    public static double saisirReel () {

        Scanner clavier=new Scanner(System.in);
        String s = clavier.nextLine();
        double lu = -123.987;
        try{
            lu = Double.parseDouble(s);
        }
        catch(NumberFormatException ex){
            System.out.println("Ce n'est pas un reel valide");
        }
        return lu;
    }

    public static int saisirEntier () {

        Scanner clavier=new Scanner(System.in);
        String s = clavier.nextLine();
        int lu=456;
        try{
            lu = Integer.parseInt(s);
        }
        catch(NumberFormatException ex){
            System.out.println("Ce n'est pas un entier valide");
        }
        return lu;
    }
}
