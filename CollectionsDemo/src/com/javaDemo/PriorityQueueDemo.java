import java.util.*;

class PriorityQueueDemo
{
	public static void main(String[] args) 
	{
	
/*		PriorityQueue q = new PriorityQueue();
		//System.out.println(q.peek());
		//System.out.println(q.poll());
		//System.out.println(q.element());

		for(int i = 0; i <= 10; i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);  */


































        PriorityQueue p = new PriorityQueue(15, new MyComparator());
        p.offer("A");
        p.offer("Z");
        p.offer("L");
        p.offer("B");
        System.out.println(p);



	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1 = (String) obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}