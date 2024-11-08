package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(1, 2, 3, 4);
		List<Double> doubList = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();

		copy(intList, myObjs);
		copy(doubList, myObjs);
		
		printList(myObjs);
	}

	public static void copy(List<? extends Number> source, List<? super Number> obj) {
		for (Number num : source) {
			obj.add(num);
		}
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
	}
}
