package OopsDemo;

	

	class Employee{
		void company() {
			System.out.println("company : TNSIF");
		}
	}

	class Developer extends Employee{
		void role() {
			System.out.println("Role : SoftwareDeveloper");
		}
	}

	class Tester extends Employee{
		void role() {
			System.out.println("Role : Testing Engineer");
		}
	}

	public class HeiarchicalInheritence {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Developer d = new Developer();
			d.company();
			d.role();
			
			Tester t = new Tester();
			t.company();
			t.role();

		}

	}


