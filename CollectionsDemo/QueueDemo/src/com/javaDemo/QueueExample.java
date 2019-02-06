package com.javaDemo;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();   // creating priority queue
		queue.add("Nihal");                                         //  adding element
		queue.add("Rachit");
		queue.add("Sahil");
		System.out.println("haed :" + queue.element());
		System.out.println("head :" + queue.peek());
		System.out.println("Iterating the queueu elements");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("After removing two elements :");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
