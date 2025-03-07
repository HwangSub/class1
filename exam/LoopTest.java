package exam;

public class LoopTest {
	public static void main(String[] args) {

		for(int i=1; i<=31; i++) {
			if(i%7 == 0) {
				System.out.print(i+" ");
			}	
		}
		System.out.println();
		int j=1;
		while(j<=31) {
			if(j%7 == 0) {
				System.out.print(j+" ");
			}
			j++;
		}
	}
}
