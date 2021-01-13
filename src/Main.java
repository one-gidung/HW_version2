import java.util.InputMismatchException;
import java.util.Scanner;

class Delivery {
	int charge;
	Delivery() {
		charge = 3300;
	}
}

abstract class Cal {
	public abstract int add(int a, int b);
}

public class Main extends Cal {
	@Override
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String menu;
		int charge;

		System.out.println("<메뉴판>");
		System.out.println("[1번] 아메리카노: 3000원");
		System.out.println("[2번] 라떼: 4000원");
		System.out.println("[3번] 아인슈페너: 5000원");
		System.out.println("원하는 음료의 번호를 입력하세요.");
		
		int m;
		while (true) {
			System.out.print(">>");
			try {
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();
				continue;
			}
		}
		if(m == 1) {
			menu = "아메리카노";
			charge = 3000;
		} else if(m == 2) {
			menu = "라떼";
			charge = 4000;
		} else {
			menu = "아인슈페너";
			charge = 5000;
		}
		
		System.out.println("따뜻한 음료는 0, 차가운 음료는 1을 입력하세요");
		int n;
		String HotIce;
		
		while (true) {
			System.out.print(">>");
			try {
				n = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.next();
				continue;
			}
		}
		
		if (n == 0) HotIce = "Hot";
		else {
			HotIce = "Ice";
			charge += 500;
		}
		Main d = new Main();
		Delivery del = new Delivery();
		
		System.out.print("주문서: " + menu + "(" + HotIce + "): " + d.add(charge, del.charge));
		
		scanner.close();
	}
}