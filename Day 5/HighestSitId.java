import java.util.Arrays;

public class HighestSitId {
	public static void main(String[] args) {
		Input input = new Input();

		int[] id = new int[input.getInput().length]; 

		for(String element : input.getInput()) {
			int[] row = newIntegerArray(128);
			int[] column = newIntegerArray(8);

			for(int  i = 0; i < element.length(); i++) {
				switch(element.charAt(i)) {
					case 'B':
					row = Arrays.copyOfRange(row, row.length / 2, row.length);
					break;

					case 'F':
					row = Arrays.copyOfRange(row, 0, row.length / 2);
					break;

					case 'L':
					column = Arrays.copyOfRange(column, 0, column.length / 2);
					break;

					case 'R':
					column = Arrays.copyOfRange(column, column.length / 2, column.length);
					break;
				}
			}

			id[Arrays.asList(input.getInput()).indexOf(element)] = (row[0] * 8) + column[0];
		}

		System.out.println(max(id));
	}

	public static int max(int[] array) {
		if(array.length == 0) {
			System.out.println("array has no element");
			System.exit(0);
		}

		int max = array[0];
		for(int element : array)
			if(max < element)
				max = element;
		return max;
	}

	public static int[] newIntegerArray(int length) {
		int[] array = new int[length];
		for(int i = 0; i < length; i++)
			array[i] = i;
		return array;
	}
}