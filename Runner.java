import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Runner {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter numbers and type 'stop' to stop entering");
		
		LinkedList<Integer> list = new LinkedList<>();
		
		while(true) {
			String a = input.next();
	
			if(a.equalsIgnoreCase("stop")) {
				Collections.sort(list);
				String format = list.toString().replace("[", "").replace("]", "").replaceAll(",", "").trim();
				System.out.println(format);
				break;
			}
			else {
				list.add(Integer.parseInt(a));
			}
		}
	}
	
}
