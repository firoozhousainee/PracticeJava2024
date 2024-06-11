package structy_linkedList;

import java.util.ArrayList;

public class DeletClass {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Firoo");
		arrayList.add("Housainee");

		System.out.println(arrayList.size());

		for (String arr : arrayList) {
			System.out.println(arr);
		}
	}
}