package calc;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int s1=0, s2=0;

		while (true) {
			/* 코드를 완성 합니다 */

			String str = scanner.nextLine();

			if (str.equals("quit")) {
				break;
			} else {

				String[] tokens = str.split(" ");
				System.out.println(">>" + str);

				s1 = Integer.parseInt(tokens[0]);
				s2 = Integer.parseInt(tokens[2]);
				System.out.println(tokens[0] + " " + tokens[2]);

				Arith arith = null; // null exception?????
				

				if (tokens[1].equals("+")) {
					arith = new Add();

				} else if (tokens[1].equals("-")) {
					arith = new Sub();

				} else if (tokens[1].equals("*")) {
					arith = new Mul();

				} else if (tokens[1].equals("/")) {
					arith = new Div();

				}

				arith.setValue(s1, s2);
				int result = arith.calculate();
				System.out.println(">>" + result);
			}

		}

		scanner.close();

	}

}
