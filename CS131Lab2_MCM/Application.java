
public class Application {

	public static void main(String[] args) {
		
		Wizard wiz = new Wizard("Albus", 100);
		System.out.println(wiz.toString());
		
		wiz.setKey(123);
		
		wiz.lock(123);
		
		System.out.println(wiz.toString());
		
		wiz.takeDamage(30);
		
		wiz.unlock(123);
		
		wiz.takeDamage(20);
		
		wiz.lock(1234);
		
		wiz.takeDamage(40);
		
	}//end main

}//end class
