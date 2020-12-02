public class Testing {
	public static void main(String[] args) {
		Password pass = new Password("2-6 w: wkwwwfwwpvw");

		System.out.println("minimum presences =>" + pass.getMinimumPresences());
		System.out.println("maximum presences =>" + pass.getMaximumPresences());
		System.out.println("Character =>" + pass.getCharacter());
		System.out.println("Password =>" + pass.getPassword());

	}
}