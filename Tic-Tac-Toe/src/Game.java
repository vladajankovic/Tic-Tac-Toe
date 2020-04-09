import java.util.Scanner;

public class Game {

	private static final Exception Exception = null;

	static void ispis(char[] niz) {
		StringBuilder sb = new StringBuilder();
		sb.append('\n');
		sb.append(' ').append(niz[6]).append(' ').append('|').append(' ').append(niz[7]).append(' ').append('|')
				.append(' ').append(niz[8]).append('\n');
		sb.append("---").append('+').append("---").append('+').append("---").append('\n');
		sb.append(' ').append(niz[3]).append(' ').append('|').append(' ').append(niz[4]).append(' ').append('|')
				.append(' ').append(niz[5]).append('\n');
		sb.append("---").append('+').append("---").append('+').append("---").append('\n');
		sb.append(' ').append(niz[0]).append(' ').append('|').append(' ').append(niz[1]).append(' ').append('|')
				.append(' ').append(niz[2]).append('\n');
		System.out.println(sb.toString());
		for (int i = 0; i < 2; i++)
			System.out.println('\n');
	}

	static void win(char[] niz) {
		if (niz[0] == 'X' && niz[1] == 'X' && niz[2] == 'X') {				//horizontalno
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[0] == 'O' && niz[1] == 'O' && niz[2] == 'O') {
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[3] == 'X' && niz[4] == 'X' && niz[5] == 'X') {
			System.out.println("Pobedio " + niz[3]);
			System.exit(0);
		}
		if (niz[3] == 'O' && niz[4] == 'O' && niz[5] == 'O') {
			System.out.println("Pobedio " + niz[3]);
			System.exit(0);
		}
		if (niz[6] == 'X' && niz[7] == 'X' && niz[8] == 'X') {
			System.out.println("Pobedio " + niz[6]);
			System.exit(0);
		}
		if (niz[6] == 'O' && niz[7] == 'O' && niz[8] == 'O') {
			System.out.println("Pobedio " + niz[6]);
			System.exit(0);
		}
		
		
		if (niz[0] == 'O' && niz[3] == 'O' && niz[6] == 'O') {				//vertikalno
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[0] == 'X' && niz[3] == 'X' && niz[6] == 'X') {
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[1] == 'X' && niz[4] == 'X' && niz[7] == 'X') {
			System.out.println("Pobedio " + niz[1]);
			System.exit(0);
		}
		if (niz[1] == 'O' && niz[4] == 'O' && niz[7] == 'O') {
			System.out.println("Pobedio " + niz[1]);
			System.exit(0);
		}
		if (niz[2] == 'X' && niz[5] == 'X' && niz[8] == 'X') {
			System.out.println("Pobedio " + niz[2]);
			System.exit(0);
		}
		if (niz[2] == 'O' && niz[5] == 'O' && niz[8] == 'O') {
			System.out.println("Pobedio " + niz[2]);
			System.exit(0);
		}
		
		
		if (niz[0] == 'X' && niz[4] == 'X' && niz[8] == 'X') {				//dijagonalno
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[0] == 'O' && niz[4] == 'O' && niz[8] == 'O') {
			System.out.println("Pobedio " + niz[0]);
			System.exit(0);
		}
		if (niz[6] == 'X' && niz[4] == 'X' && niz[2] == 'X') {
			System.out.println("Pobedio " + niz[6]);
			System.exit(0);
		}
		if (niz[6] == 'O' && niz[4] == 'O' && niz[2] == 'O') {
			System.out.println("Pobedio " + niz[6]);
			System.exit(0);
		}
		
		
		if ((niz[0] == 'X' || niz[0] == 'O') && (niz[1] == 'X' || niz[1] == 'O') && (niz[2] == 'X' || niz[2] == 'O')
				&& (niz[3] == 'X' || niz[3] == 'O') && (niz[4] == 'X' || niz[4] == 'O')
				&& (niz[5] == 'X' || niz[5] == 'O') && (niz[6] == 'X' || niz[6] == 'O')
				&& (niz[7] == 'X' || niz[7] == 'O') && (niz[8] == 'X' || niz[8] == 'O')) {
			System.out.println("Nereseno.");
			System.exit(0);
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		char[] niz = new char[] { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
		boolean turn = false;
		ispis(niz);

		while (true) {
			try {
				while (true) {
					if (turn) {
						System.out.println("O je na redu. Unesite broj polja:");
						int polje = new Scanner(System.in).nextInt();
						if (niz[polje - 1] == 'X' || niz[polje - 1] == 'O')
							throw Exception;
						niz[polje - 1] = 'O';
					} else {
						System.out.println("X je na redu. Unesite broj polja:");
						int polje = new Scanner(System.in).nextInt();
						if (niz[polje - 1] == 'X' || niz[polje - 1] == 'O')
							throw Exception;
						niz[polje - 1] = 'X';
					}
					turn = turn ? false : true;
					ispis(niz);
					win(niz);
				}
			} catch (Exception e) {
				System.out.println("Greska, pokusajte ponovo.");
			}
		}

	}

}