package supervariable;

public class Methodoverride {
	class Printer {
	    void printDocument() {
	        System.out.println("Printing basic black-and-white text...");
	    }
	}

	class ColorPrinter extends Printer {
	    @Override
	    void printDocument() {
	        super.printDocument(); // Executes basic print function
	        System.out.println("Adding rich full-color graphics...");
	    }
	}

	public class MethodOverride {
	    public static void main(String[] args) {
	        ColorPrinter printer = new ColorPrinter();
	        printer.printDocument();
	    }
	}
}
