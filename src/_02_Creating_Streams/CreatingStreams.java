package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreams {
	 // Function convert a List into Stream 
    private static <T> void getStream(List<T> list) 
    { 
  
        // Create stream object with the List 
        Stream<T> stream = list.stream(); 
  
        // Iterate list first to last element 
        Iterator<T> it = stream.iterator(); 
  
        // Iterate stream object 
        while (it.hasNext()) { 
            System.out.print(it.next() + " "); 
        } 
    } 
  
	
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		
		
		String[] strArr = {"one", "two", "three", "four"};
		
		Stream<String> stringStream= Arrays.stream(strArr);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		getStream(intList);
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		Stack<Random> randStack = new Stack<Random>();
		getStream(randStack);
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		
		
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
		
		List<Double> doubleStream= dQueue.stream().collect((Collectors.toList()));
	}
}
