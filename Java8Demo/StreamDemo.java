import java.util.*;
class StreamDemo
{
	public static void main(String[] args) {
		//sum of greater elements of 10
	/*	List<Integer> listOfInt = Arrays.asList(11,5,12,10,9,7,21);
		int sum = listOfInt.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		System.out.println("sum:" + sum);  */





//list of elements greater than 10
		List<Integer> listOfInt = Arrays.asList(11,5,12,10,9,7,21);
		listOfInt.stream().filter(i -> i > 10).forEach(p -> System.out.println(p));
		listOfInt.stream().filter(i -> i > 10).map(x -> x*x).forEach(p -> System.out.println("square of elements are :"+p));

	}
}