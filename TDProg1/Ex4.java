class Ex4{

	public static void main(String[] t) {
		
		int[] l = new int[1000];
		int i = 0;
		do {
			Ut.afficher("Saisir un entier positif (0 pour arrêter): ");
			int entry = Ut.saisirEntier();
			l[i] = entry;
			i++;
		} while (i < 1000 &&  l[i -1] != 0);
	}

}