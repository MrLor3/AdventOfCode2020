public class Password {
	private int minimumPresences;
	private int maximumPresences;
	private String character;
	private String password;

	public Password(String str) {
		String tempMinimimumPresences = "";
		int i = 0;
		while(str.charAt(i) != '-') {
			tempMinimimumPresences += str.charAt(i);
			i++;
		}
		i++;
		minimumPresences = Integer.parseInt(tempMinimimumPresences);

		String tempMaximumPresences = "";
		
		while(str.charAt(i) != ' ') {
			tempMaximumPresences += str.charAt(i);
			i++;
		}
		maximumPresences = Integer.parseInt(tempMaximumPresences);

		i++;
		character = String.valueOf(str.charAt(i));

		i +=2;
		password = "";
		for(int j = i; j < str.length(); j++) {
			password += str.charAt(j);
		}
	}

	public int getMinimumPresences() {
		return minimumPresences;
	}

	public int getMaximumPresences() {
		return maximumPresences;
	} 

	public String getCharacter() {
		return character;
	}

	public String getPassword() {
		return password;
	}
}