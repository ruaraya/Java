package excersices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class FilteringStrings {

	public static void main(String[] args) {
		
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		List<String> words = Arrays.asList("peter", "ana", "mike", "xenia");
		List<Integer> myNumbers = Arrays.asList(4, 8, 15, 16, 23, 42);
				
		ArrayList<String> newList = new ArrayList<String>();
		String numbers = "";
		List<String> filteredList;
				
		FilteringStrings filter = new FilteringStrings();
		System.out.println(filter.search(words).toString());
		System.out.println(filter.filterAndSort(myList).toString());
		System.out.println(filter.getString(myNumbers).toString());
						
	}
	
	public List<String> search(List<String> list) {
		
		return list
				.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length()==3)
				.collect(Collectors.toList());
		
	}
	
	public ArrayList<String> filterAndSort(List<String> list){
		
		return list
				.stream()
			    .filter(s -> s.startsWith("c"))
			    .map(String::toUpperCase)
			    .sorted()
			    .collect(Collectors.toCollection(ArrayList::new));
	}
	
	public String getString(List<Integer> list) {
	
		List<String> bList = new ArrayList<>();
		
		list
			    .stream()
			    .forEach( n -> {
				if (n.intValue() % 2 == 0) {
				   	bList.add("e"+n.toString());
				} else {
					bList.add("o"+n.toString());
				}
			 });
		
	    return bList.stream().map(n -> n.toString()).collect(Collectors.joining(","));
			    		
	}

}
