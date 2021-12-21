package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepresentation {

	public static void main(String[] args) {
		//Creating a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore");
		list.add("Rourkela");
		list.add("Pune");
		list.add("Chennai");
		list.add("Kolakata");
		System.out.println("Elements of the list is"+list);
		//I want to add some more elements to the linked list
		//1st position
		list.addFirst("Delhi");
		//last position		
		list.addLast("Trichy");
		//2nd position
		list.add(2, "Bihar");
		System.out.println("Linked list after adding few more elements to this:");
		//System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}