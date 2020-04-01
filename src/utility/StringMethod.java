package utility;

/*
Go to StringMethod class and create the following methods.
Write a method to convert the String to lowercase.
Write a method to convert the String to uppercase.
Write a method to find the first character in the string.
Write a method to return string length.
Write a method to trim the input string.
All the methods should return the value as string.
*/

public class StringMethod {
	private String input;

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String lower(String input) {
		String output = input.toLowerCase();
		return output;

	}

	public String upper(String input) {
		String output = input.toUpperCase();
		return output;
	}

	public String firstCharacter(String input) {
		String output = Character.toString(input.charAt(0));
		return output;
	}

	public String length(String input) {
		String output = String.valueOf(input.length());
		return output;
	}

	public String trim(String input) {
		String output = input.trim();
		return output;
	}

}
