class Ex3{
    public static void main(String[] t) {

		//Déclaration variable
		Ut.afficher("Saisir un entier: ");
		int a = Ut.saisirEntier();
		
		Ut.afficher("Saisir un entier: ");
		int b = Ut.saisirEntier();
		
		Ut.afficher("Saisir un entier: ");
		int c = Ut.saisirEntier();
		
		Ut.afficher("Saisir un entier: ");
		int d = Ut.saisirEntier();

		//Algo
		Ut.afficher("Sortie: ");
		if (a == b && a == c && a == d) {
		    Ut.afficher("4");
		}
		else if ((a == b && a == c && a != d) || (b == c && c == d && b != a) || (c == d && d == a && c != b) || (d == a && a == b && d != c)) {
		    Ut.afficher("3");
		}
		else if ((a == b && a != c && a != d && b != c && b != d && c != d) ||
		(b == c && b != a && b != d && c != a && c != d && a != d) || 
		(c == d && c != a && c != b && d != a && d != b && a != b) || 
		(a == d && a != b && a != c && d != b && d != c && b != c) || 
		(a == c && a != b && a != d && c != b && c != d && b != d) || 
		(b == d && b != a && b != c && d != a && b != c && b != d)) {
		    Ut.afficher("2");
		}
		else if ((a == b && a != c && a != d && b != c && b != d && c == d) ||
		(b == c && b != a && b != d && c != a && c != d && a == d) || 
		(c == d && c != a && c != b && d != a && b != b && a == b) || 
		(a == d && a != b && a != c && d != b && d != c && b == c) || 
		(a == c && a != b && a != d && c != b && c != d && b == d) || 
		(b == d && b != a && b != c && d != a && b != c && b == d)) {
		    Ut.afficher("22");
		}
		else if (a != b && a != c && a!= d && b !=c && b != d && c != d) {
		    Ut.afficher("1");
		}
		else {
		    Ut.afficher("0");
		}
		
		Ut.passerLigne();
    }
}
