package desafios;

public class DesafioAritmetico {

	public static void main(String[] args) {

		final double inferior = Math.pow(10, 3);

		double total;

		int numA = 6 * (3 + 2);
		int denA = (2 * 3);
		double superiorA = Math.pow(numA, 2) / denA;

		int numB = (1 - 5) * (2 - 7);
		int denB = 2;
		double superiorB = numB / denB;
		superiorB = Math.pow(superiorB, 2);

		double superior = superiorA - superiorB;
		superior = Math.pow(superior, 3);

		total = superior / inferior;

		System.out.println(total);

	}

}
