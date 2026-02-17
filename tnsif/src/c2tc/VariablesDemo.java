package c2tc;

public class VariablesDemo {
		int a = 10;
		void print() {
			String msg = "hello";
			System.out.println(msg);
		}
		static String message = "hello students";

		public static void main(String[] args) {
			VariablesDemo obj = new VariablesDemo();
			System.out.println("the value of a :"+ obj.a);
			obj.print();
			System.out.print(message);
			

		}

	}

}
