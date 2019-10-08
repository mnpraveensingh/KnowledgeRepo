package collection;

import java.util.LinkedList;

public class LinkedListExp {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		System.out.println("1st "+linkedList);
		linkedList.add("Pravin");linkedList.add("Usha");
		System.out.println("2nd "+linkedList);
		linkedList.add(1,"Keshava");linkedList.add(2,"Milan");
		System.out.println("3rd "+linkedList);
		linkedList.set(1,"Bittu");
		System.out.println("4th "+linkedList);
		linkedList.removeFirst();linkedList.removeLast();
		System.out.println("5th "+linkedList);
		linkedList.addLast("Keshava");linkedList.addFirst("Usha");
		System.out.println("6th "+linkedList);
		linkedList.remove();
		System.out.println("7th "+linkedList);
		linkedList.remove(linkedList.size()-1);
		System.out.println("8th "+linkedList);
		createLinkedKist();
	}
	
	public static void createLinkedKist() {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		System.out.println("linkedList "+linkedList);
	}
}
