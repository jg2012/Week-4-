import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lab {

	public static void main(String[] args) {

		//Why would we use a Strinbbuilder instead of a String? 
		
		/*
		 * Instantiate a new String Builder and append the charecters 0 through 9 to it seperated by dashes 
		 * make sure no dash appears at the end of the StrinbBuilder
		 */
		
		StringBuilder numbers = new StringBuilder(); 
		
		for(int i = 0 ; i< 10; i++) {
			numbers.append(i); 
			if(i !=9) {
				numbers.append( "-"); 
			}
			
		}
		System.out.println(numbers.toString());
		
		// create a list of Strings and add 5 Strings to it, each with a different length 
		List <String> differentLength = new ArrayList<String>(); 
		differentLength.add("I");
		differentLength.add("Soccer");
		differentLength.add("Football");
		differentLength.add("Basketball");
		differentLength.add("Baseball");
		
		for (int i = 0 ; i < differentLength.size(); i++) {
			System.out.println(differentLength.get(i));
		}
	
		//write and test a method that takes a list of strings and returns the shortest string
		
		
		System.out.println(findShortestString(differentLength));
		
		
		//write and test a method that takes a list of strings and returns the list with the first and last element switched
		
		List<String > switchWord = switchWord(differentLength); 
		for(String string: switchWord) {
			System.out.println(string);
		}
		
		/*/
		 * write and test a method that takes a list of string and returns a string with all the list elements concatenated to each others 
		 * separated by a cpma
		 */
		
		System.out.println(differentLength);
		
		/*
		 * write and test a method that takes a list of strings and a string and returns a new list with all strings from 
		 * the original list containing the second string parameter (i.e. like a search method) 
		 * 
		 */
		
		System.out.println("-----------------------------");
		List<String> searchResults = search(differentLength, "l"); 
		for(String result: searchResults) {
			System.out.println(result);
		}
		
		
		/*
		 * write and test a method that takes a list of integers and returns a List<list<Integer>> 
		 * where the first list in the returned valued contains any number from the input list that is divisible by 2, the second list contains values 
		 * from the input list that are divisible by 3, the third divisible by 
		 * 
		 */
		
		
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,10, 11,12,15,16,20,25,30); 
		List<List<Integer>>  sortedNumbers = sortDivisibleNumbers(number); 
		
		
		for (List<Integer> list : sortedNumbers) {
			for(Integer num: list) {
				System.out.println(num);
			}
			System.out.println("Next List --------");
		}
		
		//write and test a method that takes a list of strings and returns a list of integers that contains the length of each string
		
		List < Integer> stringsLength = calculateStringLengths(differentLength); 
		for(Integer i : stringsLength) {
			System.out.println((i));
		}
		
		
		//create a set of strings and add 5 values 
		
		Set<String> set = new HashSet<String>();
		set.add("Hello"); 
		set.add("World"); 
		set.add("Goodbye");
		set.add("Hi"); 
		set.add("Hello again"); 
		
		
		
		/*
		 * write and test a method that takes a set of strings and a character and return a set of strings consisting of all 
		 * the strings in the input set that start with the character parameter. 
		 */
		
		Set<String> startsWithH = findAllthatStartWith(set, 'H');
		for(String word : startsWithH) {
			System.out.println(word);
		}
		
		//write and test a method that takes a set of strings and returns a list of the same string. 
		
		List < String > resultList = convertSetList(set); {
			for(String listString : resultList) {
				System.out.println(listString);
			}
		}
		
		
		//write and test a method that takes a set of integers and returns a new set of integers containing only even numbers from the original set.
		
		Set<Integer> integerSet = new HashSet<Integer> (); 
		integerSet.add(3); 
		integerSet.add(4); 
		integerSet.add(8);
		integerSet.add(33);
		
		Set<Integer> extractedEvens = extractEvens(integerSet); 
		for (Integer num : extractedEvens) {
		System.out.println(num);
		}
		
		//create a map of string and string and add 3 items to it where the key of each is a word and the value is the definition of the word
		
		Map<String, String> dictionary = new HashMap<String, String> (); 
		dictionary.put("Apple", "A crunchy fruit. Usuually, red, green or yellow"); 
		dictionary.put("Bannana", "A yellow fruit which you peel before eating");  
		dictionary.put("Java", "A programming language created in 1995 and still heavily used today."); 
		
		
		
		// write and test a method that takes a Map<String, String> and a string and returns the value for a key in the map that matches
		// string parameter (i.e. like a language dictionary lookup.) 
		
		String value = lookupValue(dictionary, "Apple"); 
		System.out.println(value);
		
		
		
		
		/*
		 * Write and test a method that takes a List<String> and returns a mapCharcater, Integer > contain a count of all the stringts that
		 * start with a given character 
		 */
		
		Map <Character, Integer>  counts = countStartingLetters (resultList); 
		for(Character character : counts.keySet()) {
			System.out.println((character + " - " + counts.get(character)));
		}
		
	}
	
	public static String findShortestString(List<String> list) {
		String shortest = list.get(0); 
		for (String string: list) {
			if (string.length()< shortest.length()) {
				shortest = string; 
			}
		}return shortest; 
	}
	
	public static List<String> switchWord(List<String> list) {
			String temp = list.get(0); 
			list.set(0, list.get(list.size()-1)); 
			list.set(list.size()-1, temp); 
			return list; 
	}
	
	public static String comaSeperation(List<String> strings){
		StringBuilder result = new StringBuilder(); 
			for (String string: strings) {
				result.append(string + " , "); 
		}
			return result.toString(); 
	}
	
	public static List<String> search(List<String> list, String query){
		List<String> results = new ArrayList<String>(); 
		for(String string: list) {
			if(string.contains(query)) {
				results.add(string); 
			}
		}
		return results; 
	}
	
	public static List<List<Integer>> sortDivisibleNumbers(List<Integer> List){
		List<List<Integer>> results = new ArrayList<List<Integer>>(); 
		results.add(new ArrayList<Integer>()); 
		results.add(new ArrayList<Integer>()); 
		results.add(new ArrayList<Integer>()); 
		results.add(new ArrayList<Integer>()); 

		for(Integer number : List) {
			if(number % 2 == 0) {
				results.get(0).add(number); 
			}
			if ( number % 3 == 0) {
				results.get(1).add(number); 
			}
			if (number % 5 == 0 ) {
				results.get(2).add(number); 
			}
			if(number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
				results.get(3).add(number); 
			}
		}
		return results; 
	}  
	
	public static List<Integer> calculateStringLengths(List<String> list){
		List<Integer> lengths = new ArrayList<Integer>();
		for(String string : list) {
			lengths.add(string.length());
		}
		return lengths; 
	}
	
	public static Set<String> findAllthatStartWith(Set<String> set, char c){
		Set<String> results = new HashSet <String>();
		
		for(String string : set) {
			if(string.charAt(0)== c) {
				results.add(string); 
			}
		}
		
		return results; 
	} 
	
	public static List<String> convertSetList(Set<String> set){
		List<String> results = new ArrayList<String>(); 
		for(String string : set) {
			results.add(string); 
		}
		return results; 
	}
	
	public static Set<Integer>  extractEvens(Set<Integer> set){
		Set<Integer> results = new HashSet<Integer> ();
		for(Integer number : set) {
			if (number % 2 ==0 ) {
				results.add(number); 
			}
		}
		return results; 
	}
	
	public static String lookupValue(Map<String, String> map, String string) {
		for(String key : map.keySet()) {
		if(key.equals(string)){
			return map.get(key); 
		}
	}
	return ""; 
}
	
	
	public static Map<Character, Integer> countStartingLetters(List<String> list){
		Map<Character, Integer>results = new HashMap<Character, Integer>();
		
		for(String string: list) {
			char c = string.charAt(0); 
			if(results.get(c) == null) {
				results.put(c,1); 
			}else {
				results.put(c, results.get(c) + 1 ); 
			}
		}
				
		return results; 
	}
	
	
} 

