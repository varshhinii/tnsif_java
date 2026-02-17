package c2tc;


	

	class Payment{
		void makepayment() {
			System.out.println("Processing payment using generic method");
		}
	}

	class UpiPayment extends Payment{
		void makepayment() {
			System.out.println("Payment done using UPI");
		}
		
	}

	class CardPayment extends Payment{
		void makepayment() {
			System.out.println("Payment done using Card");
		}
	}
	public class MethodOverriding {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Payment payment;
			payment = new UpiPayment();
			payment.makepayment();
			
			payment = new CardPayment();
			payment.makepayment();
		}

	}


