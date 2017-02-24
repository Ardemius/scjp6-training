package tsc.scjp6.exercices.exercice5_3;

public class Propagate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Propagate prop = new Propagate();
		try {
			prop.reverse("abracadabra");
			prop.reverse("");
		} catch (Exception e) {
			System.out.println("Problem encountered when reversing string !");
			e.printStackTrace();
			System.out.println("commentary after the Stack trace");
		} finally {
			System.out.println("main has ended !");
		}

	}

	public String reverse(String param) throws Exception {
		if (param.length() == 0) {
			throw new Exception("String empty !");
		}

		String reverseString = "";
		for (int i = param.length() - 1; i >= 0; --i) {
			reverseString += param.charAt(i);
		}
		return reverseString;
	}

}
