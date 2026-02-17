package c2tc;



	class Student{
		String name;
		int age;
		
		Student(){
			System.out.println("Default parameter");
		}
		
		Student(String name){
			this.name = name;
			System.out.println("Name:"+ name);
			
		}
		
		Student(String name,int age){
			this.name = name;
			this.age = age;
			System.out.println("Name:"+ name);
			System.out.println("Age:"+age);
			
		}
	}

	public class ConstructorOverloadingDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student s = new Student();
			Student s1 = new Student("Varshini");
			Student s2 = new Student("Nanditha",18);
		

		}

	}


