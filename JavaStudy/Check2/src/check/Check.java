package check;

import constants.Constants;

public class Check {
	private static String firstName = "Yoshiki";
	private static String lastName = "Shioya";

	private static void printName(String firstName,String lastName) {
		System.out.println("printName→" + lastName + firstName);
	}

	public static void main(String[] args) {
		printName(firstName,lastName);
		Pet pet= new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}
}
