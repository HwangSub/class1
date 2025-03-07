package exam;

class MyFlowerInfo extends FlowerInfo {
	
	private String size;
	private int price;
	
	public void discount() {
		price = (int)(price*0.5);
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class MyFlowerMain extends MyFlowerInfo {
	public static void main(String[] args) {
		
		MyFlowerMain my = new MyFlowerMain();
		my.setName("장미");
		my.setColor("분홍");
		my.setPrice(20000);
		my.setSize("대");
		System.out.println(my.getName());
		System.out.println(my.getColor());
		System.out.println(my.getSize());
		System.out.println(my.getPrice());
		my.discount(); // 가격 다운 실행
		System.out.println("-------------");
		System.out.println(my.getPrice());	
	}
}




