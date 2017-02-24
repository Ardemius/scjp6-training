package tsc.scjp6.exercices.exercice9_1;

public class ThreadTest implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) {
				System.out.println("i : " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new ThreadTest());
		t.start();
	}

}
