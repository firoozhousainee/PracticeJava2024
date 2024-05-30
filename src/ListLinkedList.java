import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		// 
		
		List<String> list = new LinkedList<String>(); 
		list.add("Amir");
		list.add("Kabir");
		list.add("Nabi");
		
		System.out.println(list.get(1));
		
		for(String name: list) {
			System.out.println(name);
		}
			
		list.remove("Amir");
		list.remove(1);
		for(String name: list) {
			System.out.println("Is Amir Removed? " + name);
		}
		
		

	}

}
