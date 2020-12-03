public class Day3_part2 {
	public static void main(String[] args) {
		Input input = new Input();
		Matrix[] matrix = new Matrix[input.getLength()];

		long x1 = countTrees(input, matrix, 1, 1);
		long x2 = countTrees(input, matrix, 3, 1);
		long x3 = countTrees(input, matrix, 5, 1);
		long x4 = countTrees(input, matrix, 7, 1);
		long x5 = countTrees(input, matrix, 1, 2);

		long result = x1 * x2 * x3 * x4 * x5;

		System.out.println(result);
	}

	public static int countTrees(Input input, Matrix[] matrix, int right, int down) {
		for(int i = 0; i < input.getLength(); i++) {
			matrix[i] = new Matrix(input.getData(i));
		}

		int j = 0;
		int treesCounter = 0;

		for(int i = 0; i < matrix.length; i+=down) {
			if(matrix[i].getRow()[j].equals("#")){
				treesCounter++;
			}

			j += right;
			if(j >= matrix[i].getRow().length)
				j = j - matrix[i].getRow().length;
		}
		System.out.println(treesCounter);
		return treesCounter;
	}
}