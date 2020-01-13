package com.sist;

class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
}	// Car end

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}// FireEngine end

class InstanceofTest {
	
	public static void main(String args[]) {
		Car c = new Car();
		if(c instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		} else {
			System.out.println("FireEngine 변환 불가");
		}
		if(c instanceof Object) {
			System.out.println("Object로 형변환 가능");
		}
		System.out.println(c.getClass().getName());
		
	}
}