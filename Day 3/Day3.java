public class Day3 {
	public static void main(String[] args) {
		Input input = new Input();
		Matrix[] matrix = new Matrix[input.getLength()];

		for(int i = 0; i < input.getLength(); i++) {
			matrix[i] = new Matrix(input.getData(i));
		}

		int j = 0;
		int treeCounter = 0;

		for(int i = 0; i < matrix.length; i++) {
			if(matrix[i].getRow()[j].equals("#")){
				treeCounter++;
			}

			j += 3;
			if(j >= matrix[i].getRow().length)
				j = j - matrix[i].getRow().length;
		}

		System.out.println(treeCounter);
	}
}