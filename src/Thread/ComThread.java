package Thread;

public class ComThread {

	public static void main(String[] args) {
		Tarefa1 t1 = new Tarefa1();
		Tarefa2 t2 = new Tarefa2();
		Thread thread = new Thread(t1,"tarefa1");
		Thread t = new Thread(t2,"tarefa2");
		thread.start();
		t.start();

		
	}
	
}
