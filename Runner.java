public class Runner {
	public static void main(String[] args) {

		Perfect_Square psMethod = (int a) -> {
			Math.sqrt(a) % 1 == 0 ? true | false;
		};

		psMethod(4);
		psMethod(5);
	}
}