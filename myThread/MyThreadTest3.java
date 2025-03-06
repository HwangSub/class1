package myThread;

/**
 *  멀티 스레드 - 동시실행
 */
public class MyThreadTest3 extends Thread {
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("호떡 " + i + "개");
			try {
				Thread.sleep(300); 
			} catch (Exception e) { }
		}
	}
	public static void main(String[] args) {
		MyThreadTest3 my3 = new MyThreadTest3();
		my3.start();
		for(int i=1; i<=5; i++) {
			System.out.println("개떡 " + i + "개");
			try {
				Thread.sleep(300);
			} catch (Exception e) { }
		}
	}
}
