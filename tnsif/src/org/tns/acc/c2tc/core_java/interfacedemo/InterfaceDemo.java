package org.tns.acc.c2tc.core_java.interfacedemo;

interface Vehicle10
{
	void start();
	void stop();

	int Max_speed=120;

}

class Car5 implements Vehicle10
{
   private String model;
   
   
   
	public Car5(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("Car " + model +" is Staring.");
	}

	@Override
	public void stop() {
		
		System.out.println("Car " + model +" is Stoping.");
	}
	
}

class Bike15 implements Vehicle10
{
   private String type;
   
   
   
	public Bike15(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("Bike " +type+" is Staring.");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type+" is Stoping.");
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle10 car=new Car5("KIA");
		Vehicle10 bike=new Bike15("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		System.out.println("Maximun Speed of Vehicles: " +  Vehicle.Max_speed );
		

	}

}