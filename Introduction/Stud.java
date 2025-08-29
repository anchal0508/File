/*
class Stud{
    public static void main(String[] args) {
        int a = 3;
        int b  = 2;
        int c = a+b; // c = 5
        c = c+1; // 6
        c+=1;   // 7
        c++;    // 8 (Post increment Operator)
        ++c;    // 9 (Pree increment Operator)
        System.out.println(c);
    }
}
    */

/*
    class Stud{
    public static void main(String[] args) {
        int a = 3;
        int b  = 2;
        int c = a+b; // c = 5
        System.out.println(c++); // 5
        System.out.println(c++);
    }
}
*/

/*
class Stud {
	public static void main(String[] Spider) {
		int a = 3;
		int b = 2;
		int c = a++ + b + --a; // 5

		System.out.println(c);
	}
}

 */
/*
class Stud {
	public static void main(String[] Spider) {
		int a = 5;
		int b = 10;
		int c = 0;
		System.out.println("Before Swapping a: " + a + " b: " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("After Swapping a: " + a + " b: " + b);

	}
}

 */
/*
//Swapping: Without Using Third variable
class Stud {
	public static void main(String[] Spider) {
		int a = 5;
		int b = 10;

		System.out.println("Before Swapping a: " + a + " b: " + b);
		a = a * b;	//15
		b = a / b;	//15 - 10 = 5
		a = a / b;	// 15 - 5 = 10
		System.out.println("After Swapping a: " + a + " b: " + b);
		System.out.println("After Swapping a: " + a + " b: " + b);

	}
}

*/
/*

// Command Line Argument
class Stud {
	public static void main(String[] userVar) {
		if(userVar.length>0)
			for(int i=0;i<userVar.length;i++)
				System.out.println(userVar[i]);

	}
}
*/
/*
// Power
class Stud {
	public static void main(String[] args) {
		int p = 1;
		for (int i = 0; i < 2; i++) {
			p = p*3;
		}
		System.out.println(p);
	}
}

 */
/*
// Power Using Loop
 class Stud {
	public static void main(String[] args) {
		int p = 1;
		for (int i = 0; i < 2; i++) {
			p = p*3;
		}
		System.out.println(p);
	}
}

 */
/*
 // Find Gretest Number
class Stud {
	public static void main(String[] args) {
		int a = 7;
		int b = 7;
		int c = 7;

		if (a >= b && a >= c) {
			System.out.println(a);
		}
		else if (b >= a && b >= c) {
			System.out.println(b);
		}
		else if (c >= a && c >= b) {
			System.out.println(c);
		}
	}
}
	
*/

/*
// Divisible By 5 and 11
class Stud {
	public static void main(String[] args) {
		int num = 550;
		if (num % 5 == 0 && num % 11 == 0) {
			System.out.println("Divisible BY 5 and 11");
		} else {
			System.out.println("Not Divisible");
		}
	}
}

 */
/*
// Leap 
class Stud {
	public static void main(String[] args) {
		int year = 1900;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " : is a Leap Year");
		} else {
			System.out.println(year + ": is Not a Leap Year");
		}
	}
}*/
/*
// Alphabate  testing 
class Stud {
	public static void main(String[] args) {
		char var = 'T';
		if (var >= 'a' && var <= 'z')
			System.out.println("Lower case");
		if (var >= 'A' && var <= 'Z')
			System.out.println("Upper case");
	}
}

*/
