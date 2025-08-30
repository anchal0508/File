/*

class ForLoop {
	public static void main(String[] args) {
		int p = 0;
		for (int i = 2; i <= 10 && p!=100 ; p += 5) {
			System.out.println(" " + i++ + " " + p);
		}
	}
}

*/
/*
class ForLoop {
	public static void main(String[] args) {
		int p = 0;
		for (int i = 1, j = 5; (i < 10 && j > 0); i++, j--) {
			System.out.println(i + " " + j);
		}
	}
}

*/
/*
//Table of 2 - 10 Times
 class ForLoop {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(" "+i*2);
			}
			System.out.println();
		}

	}
}
 
 
 */

 /*
//Table from 2 - 10 
 class ForLoop {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(i*j+"\t");
			}
			System.out.println();
		}

	}
}
 
 
 */
class ForLoop {
	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
