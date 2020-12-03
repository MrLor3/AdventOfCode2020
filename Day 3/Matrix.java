public class Matrix {
	public String[] row;

	public Matrix(String str) {
		row = new String[str.length()];
		for(int i = 0; i < str.length(); i++) {
			row[i] = String.valueOf(str.charAt(i));
		}
	}

	public String[] getRow() {
		return row;
	}
}