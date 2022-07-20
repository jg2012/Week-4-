
public class strBuilder {

	public static void main(String[] args) {
		String firstName = "Sally"; 
		String lastName = " Smith"; 
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3); 
		System.out.println(tripleHi);
		
		firstName = firstName.concat(lastName); 
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam"); 
		fullName.append(" Smith"); //add more characters 
		System.out.println(fullName.toString());
		
		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it")); // where the string exist 
		System.out.println(fullName.replace(4, 9, "Thompson")); //replaces strings
		System.out.println(fullName.reverse()); //prints backwards
		
	}
	
	
	public static String multiplyString(String str, int num ) {
		StringBuilder result = new StringBuilder(); 
			for(int i =0; i < num;  i++) {
				result.append(str); 
			}
			return result.toString(); 
	
}

}
