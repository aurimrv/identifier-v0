package identifier;

public class IdentifierMain {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: IdentifierMain <string>");
		} else {
			Identifier id = new Identifier();
			if (id.validateIdentifier(args[0])) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
