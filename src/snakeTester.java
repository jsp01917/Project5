
public class snakeTester {

	public static void main(String[] args) {
		Snake snake1 = new Snake();
		for (int i =0; i< snake1.getBody().size();i++){
			System.out.println(snake1.getBody().get(i));
		}

	}

}
