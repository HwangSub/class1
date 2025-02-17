package study12;

public class Books1004 {

	int price = 10000;
	String bookName;
	
	public Books1004() { 
		
	}
	public Books1004(String bookName) {
		this.bookName = bookName;
	}

	public Books1004(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	public static void main(String[] args) {
		/*
		 * 기본형 생성자의 부재시 오류발생
		 */
		Books1004 books = new Books1004();
		Books1004 java  = new Books1004("자바의 첫걸음");
		Books1004 linux = new Books1004("리눅스마스터",35000);
		
		System.out.println("book1 : "+ java.bookName + ","+java.price);
		System.out.println("book2 : "+ linux.bookName + ","+linux.price);
	}

}
