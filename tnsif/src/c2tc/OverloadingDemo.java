package c2tc;

	class Calculator{
		int add(int a ,int b) {
			return a + b;
		}
		int add(int a , int b, int c) {
			return a + b + c;
		}
	}

	public class OverloadingDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator calci = new Calculator();
			System.out.println("Two integer sum:"+ calci.add(3, 4));
			System.out.println("Three integer sum:"+calci.add(3,3,4));

		}

	}


