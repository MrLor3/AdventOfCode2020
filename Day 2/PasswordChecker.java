import java.util.*;
import java.io.*;

public class PasswordChecker{
	public static void main(String[] args) {
		Password[] password = new Password[1000];
		Input input = new Input();

		for(int i = 0; i < 1000; i++) {
			password[i] = new Password(input.data[i]);
		}

		int correctPasswordCounter = 0;
		for(int i = 0; i < password.length; i++) {
			int characterPresences = 0;
			for(int j = 0; j < password[i].getPassword().length(); j++) {
				if(String.valueOf(password[i].getPassword().charAt(j)).equals(password[i].getCharacter())) {
					characterPresences++;
				}
			}
			if(characterPresences >= password[i].getMinimumPresences() && characterPresences <= password[i].getMaximumPresences())
				correctPasswordCounter++;
		}

		System.out.println("Answer => " + correctPasswordCounter);
	}
}