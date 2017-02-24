package tsc.scjp6.exercices.exercice5_4;

import java.util.ArrayList;
import java.util.List;

public class MyException {

	private List<String> foodThatILike = new ArrayList<String>();

	public MyException() {
		super();

		foodThatILike.add("tarte aux poireaux");
		foodThatILike.add("boeuf bourguignon");
		foodThatILike.add("bière");
		foodThatILike.add("crêpes");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> foodTestList = new ArrayList<String>();
		foodTestList.add("bière");
		foodTestList.add("tartes aux prunes");
		foodTestList.add("boeuf bourguignon");
		
		MyException me = new MyException();
		
		for (String individualFood : foodTestList) {
			try {
				if (me.checkFood(individualFood)) {
					System.out.println(individualFood + " is great !");
				}
			} catch (BadFoodException e) {
				System.out.println("BOF !!!!");
				e.printStackTrace();
			}
		}
	}

	public boolean checkFood(String food) throws BadFoodException {
		
		assert !food.equals("") : "empty string !";
		
		if (foodThatILike.contains(food)) {
			return true;
		} else {
			throw new BadFoodException();
		}
	}

	class BadFoodException extends Exception {

	}

}
