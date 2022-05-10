package StandardProcedureOfJava.ch6;

class Product {
	static int count = 0;	// 생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;			// 인스턴스 고유의 번호
	
	// 인스턴스 초기화 블록
	{
		++count;
		serialNo = count;
	}
	
	public Product() {}		// 기본생성자, 생략 가능
	
}

// 초기화 블록이 어떻게 사용되는지에 대한 예제
public class ProductTest {

	public static void main(String[] args) {
		System.out.println("p1 객체 생성 전 count : " + Product.count);
		Product p1 = new Product();
		System.out.println("p1 객체 생성 후 count : " + Product.count);
		Product p2 = new Product();
		System.out.println("p2 객체 생성 후 count : " + Product.count);
		Product p3 = new Product();
		System.out.println("p3 객체 생성 후 count : " + Product.count);
		
		System.out.println("p1의 제품번호 (serial No)는 " + p1.serialNo);
		System.out.println("p2의 제품번호 (serial No)는 " + p2.serialNo);
		System.out.println("p3의 제품번호 (serial No)는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개 입니다.");
	}

}
