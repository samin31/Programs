package supervariable;
	class Animal {
	    void makeSound() {
	        System.out.println("Animal makes a general sound.");
	    }
	}

	class Dog extends Animal {
	    void makeSound() {
	        super.makeSound(); // Calls the parent method
	        System.out.println("Dog barks: Woof! Woof!"); // Child implementation
	    }
	}

	public class Animal
	{
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.makeSound();
	    }
	}

