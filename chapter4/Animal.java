package chapter4;
	class Animal {
	    String name;

	    void sound() {
	        System.out.println(name + " makes a sound.");
	    }

	    public static void main(String[] args) {
	        Animal a1 = new Animal();
	        a1.name = "Dog";
	        
	        Animal a2 = new Animal();
	        a2.name = "Cat";

	        a1.sound();
	        a2.sound();
	    }
	
}
