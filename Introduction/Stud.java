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

	}
}
