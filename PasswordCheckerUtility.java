import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class PasswordCheckerUtility {

	public static boolean isValidPassword(String passwordString) throws Exception {
			if ( isValidLength(passwordString) && hasSpecialChar(passwordString) && hasUpperAlpha(passwordString) 
					&& hasLowerAlpha(passwordString) && hasDigit(passwordString) 
					&& comparePasswordsWithReturn(passwordString, passwordString))
				return true;
			
			else if (isWeakPassword(passwordString)) 
				return true;
			 
			else
				return false;
	}

	public static boolean isValidLength(String password)  {
		int length = 0;
		for (int i = 0; i < password.length(); i++) {
			length ++;
		}

		if (length > 6)
			return true;
		else {
			return false;
		}
			
	}
	
	public static boolean isWeakPassword(String password) throws Exception {

		if (hasBetweenSixAndNineChars(password))
		{
			return true;
		}
		else {
			//return false;
			//throw new Exception("Password is weak: LengthException");

			//throw new LengthException();
			return false;
		}
	}


	public static boolean hasBetweenSixAndNineChars(String between6And9Chars) throws Exception {
		int length = 0;
		for (int i = 0; i < between6And9Chars.length(); i++) {
			length ++;
			
		}
		if (length > 6 && length < 9)
		{
			return true;
		}
		else {
			//throw new Exception("Password is OK but weak: WeakPasswordException");
			//throw new WeakPasswordException();
			return false;
		}
	}
	
	
	
	public static boolean hasSpecialChar(String withSpecialChar) throws Exception{
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(withSpecialChar);
		boolean t = matcher.find();

		if (t)
			 return true;
		 else{
			// throw new Exception("Password does not contain special characters: NoSpecialCharacterException");
			//throw new NoSpecialCharacterException();
			 return false;
			}
	}
	
	public static boolean hasUpperAlpha(String password) throws Exception {
		char character;
		int capital = 0;
		
		for ( int i = 0; i < password.length(); i++) {
			character = password.charAt(i);
			if (Character.isUpperCase(character)) {
				capital++;
			}}
		if ( capital > 0)
			return true;
		else {
			//throw new Exception("Password does not contian upper case characters: NoUpperAlphaException");
			//throw new NoUpperAlphaException();
			return false;
		}
	}
	
	public static boolean hasLowerAlpha(String password) throws Exception{
		char character;
		int lower = 0;
		
		for ( int i = 0; i < password.length(); i++) {
			character = password.charAt(i);
			if (Character.isLowerCase(character)) {
				lower++;
			}}

		if ( lower > 0)
			return true;
		else {
			//throw new Exception("Password does not contain lower case characters: NoLowerAlphaException");
			//throw new NoLowerAlphaException();
			return false;
		}
	}

	public static boolean hasDigit(String withDigit) throws Exception{
		char character;
		int number = 0;
		
		for ( int i = 0; i < withDigit.length(); i++) {
			character = withDigit.charAt(i);
			if (Character.isUpperCase(character)) {
				number++;
			}}
		if ( number > 0)
			return true;
		else 
		{
			//throw new Exception("Password does not contain Digits: NoDigitException");
			//throw new NoDigitException();
			return false;
		}
	}
	
	public static boolean hasSameCharInSequence(String string) throws Exception  {
		int j = 1;
		int match = 0;
		for (int i = 0; i < string.length(); i ++) {
			if (string.charAt(i) == string.charAt(j)) {
				match++;
			}
			j++;
			}
		if (match == 0)
			return true;
		else
		{
			//throw new Exception("Password contains sequence of characters: InvalidSequenceException");
			//throw new InvalidSequenceException();
			return false;
		}

	}


	public static void comparePasswords(String password, String passwordConfirm) {
		password.equals(passwordConfirm);
		
	}	
	

	public static boolean comparePasswordsWithReturn(String password, String passwordConfirm) {

		if (password.equals(passwordConfirm)) {
			
			return true;
		}
		else
		{

			return false;
		}

	}

	
	public static ArrayList<String> getInvalidPasswords(ArrayList<String> invalidPasswordsArray) {
		return invalidPasswordsArray;
	}


}
