import java.util.*;
import java.io.*;

public class PasswordChecker2 {
	public static void main(String[] args) {
		Password[] password = new Password[1000];
		Input input = new Input();

		for(int i = 0; i < 1000; i++) {
			password[i] = new Password(input.data[i]);
		}

		int correctPasswordCounter = 0;
		for(int i = 0; i < password.length; i++) {
			Boolean valid = false;
			if( String.valueOf(password[i].getPassword().charAt(password[i].getMinimumPresences())).equals(password[i].getCharacter())) {
				valid = true;
			}
			if( String.valueOf(password[i].getPassword().charAt(password[i].getMaximumPresences())).equals(password[i].getCharacter())) {
				if(valid)
					valid = false;
				else
					valid = true;
			}
			if(valid)
				correctPasswordCounter++;
		}

		System.out.println("Answer => " + correctPasswordCounter);
	}
}