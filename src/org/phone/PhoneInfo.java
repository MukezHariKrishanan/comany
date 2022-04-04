package org.phone;

public class PhoneInfo {

	private void nandhu() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

	private void phoneName() {
		System.out.println("Iphone");

	}
	
	private void phoneMieiNum() {
		System.out.println("321654987123");

	}
	
	private void Camera() {
		System.out.println("12MP");

	}
	
	private void storage() {
		System.out.println("64GB");

	}
	private void osName() {
		System.out.println("ios");

	}
	
	public static void main(String[] args) {
		
		//object creation - ClassName = new ClassName
		
		PhoneInfo PI = new PhoneInfo();
				
		//method call - objectName - methodName();
		
				PI.phoneName();
				PI.phoneMieiNum();
				PI.Camera();
				PI.storage();
				PI.osName();
	}
}
