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
/*
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

*/



/*
class Stud {
	public static void main(String[] args) {

		for (int j = 0; j <= 9; j++) {
			
			for (int i = 9; i >= j; i--) {
				System.out.print("  ");
			}
			for (int i = 0; i <= j; i++) {
				System.out.print(i+" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print(i+" ");
			}
			 
			System.out.println();
		}



		for (int j = 8; j >= 0; j--) {
			
			for (int i = 9; i >= j; i--) {
				System.out.print("  ");
			}
			for (int i = 0; i <= j; i++) {
				System.out.print(i+" ");
			}
			for (int i = 1; i <= j; i++) {
				System.out.print(i+" ");
			}
			 
			System.out.println();
		}

	}
}

*/

/*
class Stud {
	public static void main(String[] args) {

		for (int j = 9; j >= 4; j--) {

			for (int i = 9; i >= j; i--) {
				System.out.print("  ");
			}
			for (int i = 0; i <= j; i++) {
				System.out.print(i + " ");
			}
			for (int i = j - 1; i >= 0; i--) {
				System.out.print(i + " ");
			}

			System.out.println();
		}
		for (int j = 4; j <= 9; j++) {

			for (int i = 9; i >= j; i--) {
				System.out.print("  ");
			}
			for (int i = 0; i <= j; i++) {
				System.out.print(i + " ");
			}
			for (int i = j - 1; i >= 0; i--) {
				System.out.print(i + " ");
			}

			System.out.println();
		}

		
	}
}
*/


/*
class Stud {
static void cutStar(){
	for (int i = 6; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
}
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		cutStar();
		cutStar();
		cutStar();
		 for (int i = 0; i <= 9; i++) {
			 
			for (int j = 0; j <= 3; j++) {
				System.out.print("    ");
			}
			for (int j = 0; j <= 3; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
}

*/
/*
// Twinkel Star
class Stud {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 15; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		for (int i = 15; i >= 11; i--) {
			for (int j = 15; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		for (int i = 11; i <= 15; i++) {
			for (int j = 15; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 15; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}
}

*/

/*
// Star Frame
class Stud {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j >= 3 && j <= 7 && i >= 3 && i <= 7 )
					System.out.print(" " + " ");
				else
					System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}

*/

public class Stud {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (j > 1 && j < i && i!=5 && i!=6)
					System.out.print(" " + "   ");
				else
					System.out.print("*" + " * ");
			}
			System.out.println();
		}
	}
}

