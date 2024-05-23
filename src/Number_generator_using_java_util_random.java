import java.util.Random;
import java.util.Scanner;
public class Number_generator_using_java_util_random {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Намислил съм число от 0 до 101, опитай се да го познаеш!");
		Scanner input=new Scanner(System.in);
		Random r= new Random();
		int n=r.nextInt(100)+1;
		int guess;
		int br=10000000;
		for(int i =1; i<br;i++){
			System.out.println("Въведи число");
			guess=input.nextInt();
			if(guess!=n){
				
			}
				if(guess<n){
					System.out.println("Нагоре");
					
				
			}
				if(guess>n){
				System.out.println("Надолу");
			}
				if (n==guess){
				System.out.println("Браво ти позна");
				br=i;
			}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
		System.out.println("Общ брой опити: "+br);	
	}

}
