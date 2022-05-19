package StandardProcedureOfJava.ch7;

class Product2 {
	int price;			// 제품의 가격
	int bonusPoint;		// 제품 구매시 제공하는 보너스 점수
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2() {}	// 기본 생성자
}

class Tv4 extends Product2 {
	Tv4() {	super(100);	}
	public String toString() { return "Tv"; }
}

class Computer4 extends Product2 {
	Computer4() {super(200);}
	public String toString() { return "Computer"; }
}

class Audio extends Product2 {
	Audio() { super(50); }
	public String toString() { return "Audio"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}


public class PolyArgumentTest2 {

	public static void main(String[] args) {
		
		Buyer2 b = new Buyer2();
		b.buy(new Tv4());
		b.buy(new Computer4());
		b.buy(new Audio());
		b.summary();
	}

}
