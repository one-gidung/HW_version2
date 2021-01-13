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

		System.out.println("<�޴���>");
		System.out.println("[1��] �Ƹ޸�ī��: 3000��");
		System.out.println("[2��] ��: 4000��");
		System.out.println("[3��] ���ν����: 5000��");
		System.out.println("���ϴ� ������ ��ȣ�� �Է��ϼ���.");
		
		int m;
		while (true) {
			System.out.print(">>");
			try {
				m = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
				scanner.next();
				continue;
			}
		}
		if(m == 1) {
			menu = "�Ƹ޸�ī��";
			charge = 3000;
		} else if(m == 2) {
			menu = "��";
			charge = 4000;
		} else {
			menu = "���ν����";
			charge = 5000;
		}
		
		System.out.println("������ ����� 0, ������ ����� 1�� �Է��ϼ���");
		int n;
		String HotIce;
		
		while (true) {
			System.out.print(">>");
			try {
				n = scanner.nextInt();
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���!");
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
		
		System.out.print("�ֹ���: " + menu + "(" + HotIce + "): " + d.add(charge, del.charge));
		
		scanner.close();
	}
}