package myThread;

class Test2 {
	public volatile String a = "aa"; 
	public String b = "bb";
	public String getA() {
		return a;
	}
	public String getB() {
		return b;
	}
}
public class Test1 extends Test2 {
	
	String a = "aa-1";
	String b = "bb-1";
	
	public static void main(String[] args) {	
		for(int i=1; i<=10; i++) {
			System.out.println(i + "초 경과 ");
			try {
				Thread.sleep(1000);
			} catch(Exception e) { }
		}
	}
}
