package sashselenium.java;

public class FunctionDemo {

	public static void main(String[] args) {
		
		FunctionDemo obj = new FunctionDemo();
		obj.addTwoNumbers(10, 12);
		
		int additionResult = obj.addThreeNumbers(1, 2, 3);
		System.out.println("Result = "+ additionResult);
		
		FunctionDemo.printName("Ramesh");
		
	}
		
		public void addTwoNumbers(int x, int y) {
			System.out.println(x+y);
		}
		
		public int addThreeNumbers(int a, int b, int c) {
			
			int result = a + b + c;
			return result;
		}
		
		//can be called through the class name
		public static void printName(String name) {
			System.out.println("Hello "+ name);
		}

	}


