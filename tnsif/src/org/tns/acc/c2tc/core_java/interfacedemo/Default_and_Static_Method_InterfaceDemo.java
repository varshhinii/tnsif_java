package org.tns.acc.c2tc.core_java.interfacedemo;

interface Vehicle
{
	void start();
	void stop();

	int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void checkMaintaince()
	{
		System.out.println("Vehicle maintaince taken care here");
	}
}

class Car implements Vehicle 
{
   private String model;
   
   
   
	public Car(String model) {
		this.model = model;
	}

	@Override
	public void start() {
		
		System.out.println("Car " + model +" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("Car " + model +" is stoping ");
	}
	
}

class Bike implements Vehicle
{
   private String type;
   
   
   
	public Bike(String type) {
		this.type = type;
	}

	@Override
	public void start() {
		
		System.out.println("Bike " +type+" is staring ");
	}

	@Override
	public void stop() {
		
		System.out.println("Bike " + type+" is stoping ");
	}
	
}

public class Default_and_Static_Method_InterfaceDemo {

	public static void main(String[] args) {
		
		Vehicle car=new Car("THAR");
		Vehicle bike=new Bike("Royal Enfield"); 
		
		car.start();
		car.stop();
		
		bike.start();
		bike.stop();
		
		car.repair();
		bike.repair();
		
		Vehicle.checkMaintaince();
		
		
		System.out.println("Maximun speed of vehicles: " +  Vehicle.Max_speed );
		
	}

}