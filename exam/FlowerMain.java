package exam;

class FlowerInfo {
	public String name; 
	public String color;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

public class FlowerMain {
	public static void main(String[] args) {
		FlowerInfo flower = new FlowerInfo();
		flower.setColor("빨강");
		flower.setName("장미");
		System.out.println("꽃이름:"+flower.getName());
		System.out.println("꽃색상:"+flower.getColor());
	}
}
