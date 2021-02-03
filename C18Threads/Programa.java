import java.lang.Runnable;

class Programa implements Runnable {
	private int id;

	void setId(int id) {
		this.id = id;
	}

	int getId(int getId) {
		return this.id;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("Programa " + id + " valor: " + i);
		}
	}
}