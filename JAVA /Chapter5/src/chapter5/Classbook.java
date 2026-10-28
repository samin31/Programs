package chapter5;

	class Book {
	    String title;
	    String author;

	    Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	    }

	    // Copy constructor
	    Book(Book b) {
	        this.title = b.title;
	        this.author = b.author;
	    }

	    void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	    }

	    public static void main(String[] args) {
	        Book book1 = new Book("Java Programming", "James Gosling");

	        Book book2 = new Book(book1);

	        book2.display();
	    }
	}
