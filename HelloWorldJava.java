import java.util.Scanner;
import java.lang.String;
public class HelloWorldJava {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		float hello;
		Scanner input = new Scanner(System.in);
		System.out.println("How many times would you like to see \"Hello World\"?");

		hello = input.nextFloat();

		for(int i = 0; i<hello; i++){
			System.out.println("Hello World!");
		}
	
	}

}
