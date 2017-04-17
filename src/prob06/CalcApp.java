package prob06;

import java.util.Scanner;


public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int s1,s2,result;

		
		while( true ) {
			/*  코드를 완성 합니다 */
			String str = scanner.nextLine();
			

			
			if(str.equals("quit"))
			{
				break;
			}
			else
			{
				String[] tokens=str.split(" ");
			
				System.out.println(">>"+str);

				
				s1=Integer.parseInt(tokens[0]);
				s2=Integer.parseInt(tokens[2]);
				
				if(tokens[1].equals("+"))
				{
					Add a=new Add();
					a.setValue(s1,s2);
					result=a.calculate();
					System.out.println(">>"+result);
				}
				else if(tokens[1].equals("-"))
				{
					Sub a=new Sub();
					a.setValue(s1,s2);
					result=a.calculate();
					System.out.println(">>"+result);
				}
				else if(tokens[1].equals("*"))
				{
					Mul a=new Mul();
					a.setValue(s1,s2);
					result=a.calculate();
					System.out.println(">>"+result);
				}
				else if(tokens[1].equals("/"))
				{
					Div a=new Div();
					a.setValue(s1,s2);
					result=a.calculate();
					System.out.println(">>"+result);
				}
			}
		
			
		}
		
		scanner.close();

	}

}
