class Ex5 {
	public static void main(String[] t) {
		int[] l = new int[20];
		for (int i = 0; i < 20; i++) {
			Ut.afficher("Saisir un entier (" + (i +1) + "/20): ");
			l[i] = Ut.saisirEntier();
		}

		int stronger = l[0];
		for (int i = 1; i < 20; i++) {
			if (l[i] > stronger) stronger = l[i];
		}

		Ut.afficher("Plus grand entier: " + stronger + "\n");
	}
}