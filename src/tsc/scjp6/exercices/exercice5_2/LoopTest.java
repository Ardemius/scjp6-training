package tsc.scjp6.exercices.exercice5_2;

public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LoopTest lt = new LoopTest();
		lt.doLoopTest();
		lt.doWhileTest();

	}

	private void doWhileTest() {
		int age = 0;
		toto: while (age <= 21) {
			age++;
			if (age == 16) {
				System.out.println("get your driver's license");
				continue toto;
			}
			System.out.println("Another year");
		}
	}

	private void doLoopTest() {
		outer: for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("Hello");
				System.out.println("j = " + j);
				continue outer;
				
				// avec le continue outer, l'iteration expr de l'innermost for n'est pas
				// exécutée ! Seule l'iteration expr du for labellé l'est !
				
			} // end of inner loop
			System.out.println("outer"); // Never prints
		}
		System.out.println("Good-Bye");

	}

}
