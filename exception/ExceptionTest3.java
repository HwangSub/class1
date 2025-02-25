package exception;

public class ExceptionTest3 {

	public static void main(String[] args) {

		String[] program = {"java","oralce","linux"};
		int i=0;
		while(i<5) { // 0 1 2 -> {3} 4
			try {
				if(i==4) {
					System.out.println(i/0); // zero 오류
				} else { // 0 1 2 3
					System.out.println(program[i]); // 배열번호 오류
				}
			} catch(ArithmeticException e) {
				System.out.println("제로나누기 오류");
			} finally {
				System.out.println("-------------");
			}
			i++;  // 3,4
		}
		
		/*for( int i=0; i<program.length; i++ ) { // 0 1 2
			System.out.println(program[i]);
		}*/
		
		
	}

}
