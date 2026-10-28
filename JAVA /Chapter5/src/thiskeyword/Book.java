package thiskeyword;
	class Book {

	    String title;
	    String author;

	    // First constructor
	    Book() {
	        this("Unknown Book", "Unknown Author");
	    }

	    // Second constructor
	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    void display() {
	        System.out.println("Book Title: " + title);
	        System.out.println("Author: " + author);
	    }

	    public static void main(String[] args) {

	        Book book1 = new Book();

	        book1.display();
	    }
	}

